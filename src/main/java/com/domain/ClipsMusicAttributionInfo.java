
package com.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ClipsMusicAttributionInfo {

    private String artist_name;
    private String song_name;
    private Boolean uses_original_audio;
    private Boolean should_mute_audio;

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public Boolean getUses_original_audio() {
        return uses_original_audio;
    }

    public void setUses_original_audio(Boolean uses_original_audio) {
        this.uses_original_audio = uses_original_audio;
    }

    public Boolean getShould_mute_audio() {
        return should_mute_audio;
    }

    public void setShould_mute_audio(Boolean should_mute_audio) {
        this.should_mute_audio = should_mute_audio;
    }
}
