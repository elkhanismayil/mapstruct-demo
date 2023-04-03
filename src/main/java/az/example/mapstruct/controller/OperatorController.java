package az.example.mapstruct.controller;

import az.example.mapstruct.dto.OperatorDto;
import az.example.mapstruct.service.OperatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operator")
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorService operatorService;

    @PostMapping
    public ResponseEntity<OperatorDto> addOperator(@RequestBody OperatorDto operatorDto) {
        return ResponseEntity.status(201).body(operatorService.createOperator(operatorDto));
    }

    @GetMapping
    public ResponseEntity<List<OperatorDto>> getAllOps(){
        return ResponseEntity.ok(operatorService.getAll());
    }
}
