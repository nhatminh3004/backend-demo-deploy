package backenddemodeploy.backenddemodeploy.rescontroller;

import backenddemodeploy.backenddemodeploy.entity.ChuyenBay;
import backenddemodeploy.backenddemodeploy.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChuyenBayController {
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;
   @GetMapping("/chuyenbayDaLat")
    public List<ChuyenBay> getListChuyenBay(){

        return chuyenBayRepository.findChuyenBayDiDaLat("DAD");
    }
}
