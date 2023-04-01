package az.example.mapstruct.repository;

import az.example.mapstruct.entity.CallRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRecordsRepository extends JpaRepository<CallRecords, Long> {
}
