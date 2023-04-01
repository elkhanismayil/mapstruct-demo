package az.example.mapstruct.repository;

import az.example.mapstruct.entity.CallRecordOperators;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRecordOperatorsRepository extends JpaRepository<CallRecordOperators, Long> {
}
