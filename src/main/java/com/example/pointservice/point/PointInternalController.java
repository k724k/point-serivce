package com.example.pointservice.point;


import com.example.pointservice.point.dto.AddPointRequestDto;
import com.example.pointservice.point.dto.DeductPointRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/points") // 내부 api
public class PointInternalController {

    private final PointService pointService;

    public PointInternalController(PointService pointService) {
        this.pointService = pointService;
    }

    @PostMapping("add")
    public ResponseEntity<Void> addPoints(
            @RequestBody AddPointRequestDto addPointRequestDto
    ) {
        pointService.addPoints(addPointRequestDto);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("deduct")
    public ResponseEntity<Void> deductPoints( // 포인트 차감
            @RequestBody DeductPointRequestDto deductPointRequestDto
    ) {
        pointService.deductPoints(deductPointRequestDto);
        return ResponseEntity.noContent().build();
    }

}
