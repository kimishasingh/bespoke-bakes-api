package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.enums.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/lookup")
public class LookupController {

    @GetMapping("/budget")
    public List<String> getBudgetValues() {
        return List.of(Arrays.stream(Budget.values()).map(Budget::getDescription).toArray(String[]::new));
    }

    @GetMapping("/cake-flavour")
    public List<String> getCakeFlavourValues() {
        return List.of(Arrays.stream(CakeFlavour.values()).map(CakeFlavour::getDescription).toArray(String[]::new));
    }

    @GetMapping("/cake-size")
    public List<String> getCakeSizeValues() {
        return List.of(Arrays.stream(CakeSize.values()).map(CakeSize::getDescription).toArray(String[]::new));
    }

    @GetMapping("/delivery-option")
    public List<String> getDeliveryOptionValues() {
        return List.of(Arrays.stream(DeliveryOption.values()).map(DeliveryOption::getDescription).toArray(String[]::new));
    }

    @GetMapping("/gender-indicator")
    public List<String> getGenderIndicatorValues() {
        return List.of(Arrays.stream(GenderIndicator.values()).map(GenderIndicator::getDescription).toArray(String[]::new));
    }

    @GetMapping("/icing-flavour")
    public List<String> getIcingFlavourValues() {
        return List.of(Arrays.stream(IcingFlavour.values()).map(IcingFlavour::getDescription).toArray(String[]::new));
    }

    @GetMapping("/icing-type")
    public List<String> getIcingTypeValues() {
        return List.of(Arrays.stream(IcingType.values()).map(IcingType::getDescription).toArray(String[]::new));
    }

    @GetMapping("/item-type")
    public List<String> getItemTypeValues() {
        return List.of(Arrays.stream(ItemType.values()).map(ItemType::getDescription).toArray(String[]::new));
    }

    @GetMapping("/occasion")
    public List<String> getOccasionValues() {
        return List.of(Arrays.stream(Occasion.values()).map(Occasion::getDescription).toArray(String[]::new));
    }

}
