package dev.lioneltlynch.architectureexpo.services;

import dev.lioneltlynch.architectureexpo.model.Buildings;
import dev.lioneltlynch.architectureexpo.repo.BuildingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingsService {
    private final BuildingsRepository buildingRepository;

    @Autowired
    public BuildingsService(BuildingsRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    public List<Buildings> findAllBuildingsOrderBySelectedCriteria(List<String> selectedCriteria) {
        Sort sort = createSortFromSelectedCriteria(selectedCriteria);
        return buildingRepository.findAll(sort);
    }

    private Sort createSortFromSelectedCriteria(List<String> selectedCriteria) {
        List<Sort.Order> orders = new ArrayList<>();
        for (String criterion : selectedCriteria) {
            switch (criterion) {
                case "name" -> orders.add(Sort.Order.asc("name"));
                case "location" -> orders.add(Sort.Order.asc("location"));
                case "style" -> orders.add(Sort.Order.asc("style"));
                case "year" -> orders.add(Sort.Order.asc("year"));
                case "height" -> orders.add(Sort.Order.asc("height"));
            }
        }
        return Sort.by(orders);
    }
}