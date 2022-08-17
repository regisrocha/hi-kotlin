package dev.rrlabs.hikotlin.user.api.mapper;

import dev.rrlabs.hikotlin.user.api.resource.UserResource;
import dev.rrlabs.hikotlin.user.domain.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-17T08:38:56-0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.21.jar, environment: Java 11.0.15 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User parse(UserResource resource) {
        if ( resource == null ) {
            return null;
        }

        User user = new User();

        if ( resource.getId() != null ) {
            user.setId( String.valueOf( resource.getId() ) );
        }
        user.setName( resource.getName() );
        user.setEmail( resource.getEmail() );
        user.setNickname( resource.getNickname() );

        return user;
    }

    @Override
    public UserResource parse(User user) {
        if ( user == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String nickname = null;

        if ( user.getId() != null ) {
            id = Long.parseLong( user.getId() );
        }
        name = user.getName();
        email = user.getEmail();
        nickname = user.getNickname();

        UserResource userResource = new UserResource( id, name, email, nickname );

        return userResource;
    }

    @Override
    public List<UserResource> parse(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResource> list = new ArrayList<UserResource>( users.size() );
        for ( User user : users ) {
            list.add( parse( user ) );
        }

        return list;
    }
}
