
package com.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GraphqlContainer {

    private Graphql graphql;
    private Object native_location_data;
    private String logging_page_id;
    private Boolean photos_and_videos_header;
    private Boolean recent_pictures_and_videos_subheader;
    private Boolean top_images_and_videos_subheader;

    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    public Object getNative_location_data() {
        return native_location_data;
    }

    public void setNative_location_data(Object native_location_data) {
        this.native_location_data = native_location_data;
    }

    public String getLogging_page_id() {
        return logging_page_id;
    }

    public void setLogging_page_id(String logging_page_id) {
        this.logging_page_id = logging_page_id;
    }

    public Boolean getPhotos_and_videos_header() {
        return photos_and_videos_header;
    }

    public void setPhotos_and_videos_header(Boolean photos_and_videos_header) {
        this.photos_and_videos_header = photos_and_videos_header;
    }

    public Boolean getRecent_pictures_and_videos_subheader() {
        return recent_pictures_and_videos_subheader;
    }

    public void setRecent_pictures_and_videos_subheader(Boolean recent_pictures_and_videos_subheader) {
        this.recent_pictures_and_videos_subheader = recent_pictures_and_videos_subheader;
    }

    public Boolean getTop_images_and_videos_subheader() {
        return top_images_and_videos_subheader;
    }

    public void setTop_images_and_videos_subheader(Boolean top_images_and_videos_subheader) {
        this.top_images_and_videos_subheader = top_images_and_videos_subheader;
    }
}
