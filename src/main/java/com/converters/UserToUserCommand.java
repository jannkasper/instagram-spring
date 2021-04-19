package com.converters;

import com.api.domain.Edge__Post;
import com.api.domain.User;
import com.commands.Node__PostCommand;
import com.commands.UserCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

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
        userCommand.setUserImageUrl(source.getProfile_pic_url());

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

        return userCommand;
    }
}
