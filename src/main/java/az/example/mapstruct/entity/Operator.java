package az.example.mapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "operator")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operator_id")
    private Long id;

    @Column(name = "operator_name")
    private String name;

    @OneToMany(mappedBy = "operator")
    private List<CallRecordOperators> operators = new ArrayList<>();
}
