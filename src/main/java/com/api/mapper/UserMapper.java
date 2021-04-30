package com.api.mapper;

import com.domain.Edge;
import com.domain.NodePost;
import com.domain.User;
import com.api.model.EdgeListPostDTO;
import com.api.model.MutualFollowDTO;
import com.api.model.NodePostDTO;
import com.api.model.UserDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class UserMapper implements Converter<User, UserDTO> {

    @Override
    public UserDTO convert(User source) {
        if (source == null) {
            return null;
        }
        final UserDTO userDTO = new UserDTO();
        userDTO.setId(source.getId());
        userDTO.setUsername(source.getUsername());
        userDTO.setName(source.getFull_name());
        userDTO.setUserImageUrl(source.getProfile_pic_url());

        userDTO.setBio(source.getBiography());
        userDTO.setBioUrl(source.getExternal_url_linkshimmed());
        userDTO.setBioUrlName(source.getExternal_url());

        if (source.getEdge_owner_to_timeline_media() != null) {
            userDTO.setPostCount(source.getEdge_owner_to_timeline_media().getCount());
        }

        if (source.getEdge_followed_by() != null) {
            userDTO.setFollowersCount(source.getEdge_followed_by().getCount());
        }

        if (source.getEdge_follow() != null) {
            userDTO.setFollowingsCount(source.getEdge_follow().getCount());
        }

        userDTO.setIsVerified(source.getIs_verified());
        userDTO.setIsPrivate(source.getIs_private());
        userDTO.setHasClips(source.getHas_clips());
        userDTO.setHasStories(source.getHighlight_reel_count() != null);

        if (source.getEdge_mutual_followed_by() != null) {
            MutualFollowDTO mutualFollowDTO = new MutualFollowDTO();
            mutualFollowDTO.setCount(source.getEdge_mutual_followed_by().getCount());
            mutualFollowDTO.setUsername(source.getEdge_mutual_followed_by().getEdges()
                    .stream()
                    .map(object -> object.toString())
                    .collect(Collectors.toList()));
            userDTO.setMutualFollow(mutualFollowDTO);
        }

        if (source.getEdge_web_feed_timeline() != null && !source.getEdge_web_feed_timeline().getEdges().isEmpty()) {
            userDTO.setPostArray(new ArrayList<NodePostDTO>());
            NodePostMapper nodeConverter = new NodePostMapper();
            for (Edge<NodePost> edgePost : source.getEdge_web_feed_timeline().getEdges()) {
                if (edgePost.getNode().get__typename().equals("GraphImage")
                        || edgePost.getNode().get__typename().equals("GraphVideo")
                        || edgePost.getNode().get__typename().equals("GraphSidecar") ) {
                    final NodePostDTO nodePostDTO = nodeConverter.convert(edgePost.getNode());
                    userDTO.getPostArray().add(nodePostDTO);
                }

            }
        }

        if (source.getEdge_owner_to_timeline_media() != null && !source.getEdge_owner_to_timeline_media().getEdges().isEmpty()) {
            EdgeListPostMapper converter = new EdgeListPostMapper();
            EdgeListPostDTO edgeListPostDTO = converter.convert(source.getEdge_owner_to_timeline_media());

            userDTO.setTimelineMedia(edgeListPostDTO);
        }

        return userDTO;
    }
}
