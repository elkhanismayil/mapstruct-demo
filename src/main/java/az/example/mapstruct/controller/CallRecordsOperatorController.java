package az.example.mapstruct.controller;

import az.example.mapstruct.dto.CallRecordOperatorsDto;
import az.example.mapstruct.service.CallRecordOperatorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/callRecOps")
public class CallRecordsOperatorController {
    private final CallRecordOperatorsService service;

    @PostMapping
    public ResponseEntity<CallRecordOperatorsDto> createCalRecOps(@RequestBody CallRecordOperatorsDto operatorsDto) {
        return new ResponseEntity<>(service.create(operatorsDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CallRecordOperatorsDto>> getAllCallRecOps() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
