package com.converters;

import com.api.domain.Edge__Post;
import com.api.domain.User;
import com.commands.MutualFollowCommand;
import com.commands.Node__PostCommand;
import com.commands.UserCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class UserToUserCommand implements Converter<User, UserCommand> {

    @Override
    public UserCommand convert(User source) {
        if (source == null) {
            return null;
        }
        final UserCommand userCommand = new UserCommand();
        userCommand.setId(source.getId());
        userCommand.setUsername(source.getUsername());
        userCommand.setName(source.getFull_name());
        userCommand.setUserImageUrl(source.getProfile_pic_url());

        userCommand.setBio(source.getBiography());
        userCommand.setBioUrl(source.getExternal_url_linkshimmed());
        userCommand.setBioUrlName(source.getExternal_url());

        if (source.getEdge_owner_to_timeline_media() != null) {
            userCommand.setPostCount(source.getEdge_owner_to_timeline_media().getCount());
        }

        if (source.getEdge_followed_by() != null) {
            userCommand.setFollowersCount(source.getEdge_followed_by().getCount());
        }

        if (source.getEdge_follow() != null) {
            userCommand.setFollowingsCount(source.getEdge_follow().getCount());
        }

        userCommand.setIsVerified(source.getIs_verified());
        userCommand.setIsPrivate(source.getIs_private());
        userCommand.setHasClips(source.getHas_clips());
        userCommand.setHasStories(source.getHighlight_reel_count() != null);

        if (source.getEdge_mutual_followed_by() != null) {
            MutualFollowCommand mutualFollowCommand = new MutualFollowCommand();
            mutualFollowCommand.setCount(source.getEdge_mutual_followed_by().getCount());
            mutualFollowCommand.setUsername(source.getEdge_mutual_followed_by().getEdges()
                    .stream()
                    .map(object -> object.toString())
                    .collect(Collectors.toList()));
            userCommand.setMutualFollow(mutualFollowCommand);
        }

        if (source.getEdge_web_feed_timeline() != null && !source.getEdge_web_feed_timeline().getEdges().isEmpty()) {
            userCommand.setPostArray(new ArrayList<Node__PostCommand>());
            Node__PostToNode__PostCommand nodeConverter = new Node__PostToNode__PostCommand();
            for (Edge__Post edge__post : source.getEdge_web_feed_timeline().getEdges()) {
                if (edge__post.getNode().get__typename().equals("GraphImage")
                        || edge__post.getNode().get__typename().equals("GraphVideo")
                        || edge__post.getNode().get__typename().equals("GraphSidecar") ) {
                    final Node__PostCommand node = nodeConverter.convert(edge__post.getNode());
                    userCommand.getPostArray().add(node);
                }

            }
        }

        if (source.getEdge_owner_to_timeline_media() != null && !source.getEdge_owner_to_timeline_media().getEdges().isEmpty()) {
            userCommand.setTimelineMedia(new ArrayList<Node__PostCommand>());
            Node__PostToNode__PostCommand nodeConverter = new Node__PostToNode__PostCommand();
            for (Edge__Post edge__post : source.getEdge_owner_to_timeline_media().getEdges()) {
                if (edge__post.getNode().get__typename().equals("GraphImage")
                        || edge__post.getNode().get__typename().equals("GraphVideo")
                        || edge__post.getNode().get__typename().equals("GraphSidecar") ) {
                    final Node__PostCommand node = nodeConverter.convert(edge__post.getNode());
                    userCommand.getTimelineMedia().add(node);
                }

            }
        }

        return userCommand;
    }
}
