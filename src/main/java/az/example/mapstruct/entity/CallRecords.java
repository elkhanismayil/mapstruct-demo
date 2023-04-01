package az.example.mapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "call_records")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_record_id")
    private Long id;

    @Column(name = "caller_number")
    private String callerNumber;

    @OneToMany(mappedBy = "callRecords")
    private List<CallRecordOperators> callRecordOperators = new ArrayList<>();
}
