package com.controllers;

import com.services.LocationService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class LocationController {

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping({ "/locations/{locationId}/{locationName}"})
    public String getLocation(@PathVariable String locationId, @PathVariable String locationName, Model model)  {
        model.addAttribute("locationData", locationService.getLocationCommand(locationId, locationName));

        return "user";
    }
}