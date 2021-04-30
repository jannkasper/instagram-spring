
package com.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ProfilePage {

    private String logging_page_id;
    private Boolean show_suggested_profiles;
    private Boolean show_follow_dialog;
    private Graphql graphql;
    private Object toast_content_on_load;
    private Boolean show_view_shop;
    private Object profile_pic_edit_sync_props;
    private Boolean always_show_message_button_to_pro_account;

    public String getLogging_page_id() {
        return logging_page_id;
    }

    public void setLogging_page_id(String logging_page_id) {
        this.logging_page_id = logging_page_id;
    }

    public Boolean getShow_suggested_profiles() {
        return show_suggested_profiles;
    }

    public void setShow_suggested_profiles(Boolean show_suggested_profiles) {
        this.show_suggested_profiles = show_suggested_profiles;
    }

    public Boolean getShow_follow_dialog() {
        return show_follow_dialog;
    }

    public void setShow_follow_dialog(Boolean show_follow_dialog) {
        this.show_follow_dialog = show_follow_dialog;
    }

    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    public Object getToast_content_on_load() {
        return toast_content_on_load;
    }

    public void setToast_content_on_load(Object toast_content_on_load) {
        this.toast_content_on_load = toast_content_on_load;
    }

    public Boolean getShow_view_shop() {
        return show_view_shop;
    }

    public void setShow_view_shop(Boolean show_view_shop) {
        this.show_view_shop = show_view_shop;
    }

    public Object getProfile_pic_edit_sync_props() {
        return profile_pic_edit_sync_props;
    }

    public void setProfile_pic_edit_sync_props(Object profile_pic_edit_sync_props) {
        this.profile_pic_edit_sync_props = profile_pic_edit_sync_props;
    }

    public Boolean getAlways_show_message_button_to_pro_account() {
        return always_show_message_button_to_pro_account;
    }

    public void setAlways_show_message_button_to_pro_account(Boolean always_show_message_button_to_pro_account) {
        this.always_show_message_button_to_pro_account = always_show_message_button_to_pro_account;
    }
}
