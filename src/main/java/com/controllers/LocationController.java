package com.controllers;

import com.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Controller
public class LocationController {

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping({ "/locations/{locationId}/{locationName}"})
    public String showLocation(@PathVariable String locationId, @PathVariable String locationName, Model model)  {
        model.addAttribute("locationData", locationService.getLocationDTO(locationId, locationName));

        return "location";
    }
}