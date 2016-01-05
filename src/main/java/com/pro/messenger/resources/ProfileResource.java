package com.pro.messenger.resources;

import com.pro.messenger.model.Profile;
import com.pro.messenger.resources.beans.ProfileFilterBean;
import com.pro.messenger.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created on 30.12.2015.
 */

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

    private ProfileService profileService = new ProfileService();

    public ProfileResource() {
    }

    @GET
    public List<Profile> getProfiles(@BeanParam ProfileFilterBean profileFilterBean) {
        if (profileFilterBean.getIndexFrom() != null) {
            return profileService.getProfilesPaginated(profileFilterBean.getIndexFrom(), profileFilterBean.getIndexTo());
        }
        return profileService.getProfiles();
    }

    @POST
    public Profile addProfile(Profile profile) {
        profileService.addProfile(profile);
        return profile;
    }

    @GET
    @Path("/{profileName}")
    public Profile getProfile(@PathParam("profileName") String name) {
        return profileService.getProfile(name);
    }

    @PUT
    @Path("/{profileName}")
    public Profile updateProfile(@PathParam("profileName") String name, Profile profile) {
        profile.setName(name);
        return profileService.updateProfile(profile);
    }

    @DELETE
    @Path("/{profileName}")
    public void removeProfile(@PathParam("profileName") String name) {
        profileService.removeProfile(name);
    }

}
