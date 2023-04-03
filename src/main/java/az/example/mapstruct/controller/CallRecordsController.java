package az.example.mapstruct.controller;

import az.example.mapstruct.dto.CallRecordsDto;
import az.example.mapstruct.service.CallRecordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/callRecords")
public class CallRecordsController {
    private final CallRecordsService callRecordsService;

    @PostMapping
    public ResponseEntity<CallRecordsDto> addCallRecords(@RequestBody CallRecordsDto callRecordsDto) {
        return ResponseEntity.status(201).body(callRecordsService.createCallRecords(callRecordsDto));
    }

    @GetMapping
    public ResponseEntity<List<CallRecordsDto>> getAllRecs(){
        return ResponseEntity.ok(callRecordsService.getAll());
    }
}
