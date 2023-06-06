package dev.lioneltlynch.architectureexpo.repo;

import dev.lioneltlynch.architectureexpo.model.Buildings;
import jakarta.persistence.Id;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingsRepository extends
        JpaRepository<Buildings, Long>,
        JpaSpecificationExecutor<Buildings> {
}

