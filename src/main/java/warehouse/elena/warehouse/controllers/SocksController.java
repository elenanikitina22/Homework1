package warehouse.elena.warehouse.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import warehouse.elena.warehouse.model.Socks;
import warehouse.elena.warehouse.model.SocksColor;
import warehouse.elena.warehouse.model.SocksSize;
import warehouse.elena.warehouse.services.SocksServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/socks")
@RestController
@Tag(name = "Склад носков", description = "Операции для управления складом")
public class SocksController {
    private final SocksServices socksServices;

    public SocksController(SocksServices socksServices) {
        this.socksServices = socksServices;
    }

    @PostMapping()
    @Operation(summary = "Добавление нового товара")
    public Socks addSocks(@RequestBody Socks socks)
    {
        Socks obj = socksServices.addSocks(socks);
        return obj;
    }

    @PutMapping()
    @Operation(summary = "Отпуск носков со склада")
    public Socks takeSocks(@RequestBody Socks socks)
    {
        Socks obj = socksServices.takeSocks(socks);
        return obj;
    }

    @GetMapping()
    @Operation(summary = "Получение общего количества носков")
    public ResponseEntity<Integer> geTotalNumberOfSocks(@RequestBody SocksColor color, @RequestBody SocksSize size, @RequestBody int cottonMin, @RequestBody int cottonMax)
    {
        try
        {
            int total = socksServices.geTotalNumberOfSocks(color, size, cottonMin, cottonMax);
            return new ResponseEntity<Integer>(total, HttpStatus.OK);
        }
        catch (IllegalArgumentException e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping()
    @Operation(summary = "Списание бракованных носков")
    public Socks deleteSocks(@RequestBody Socks socks)
    {
        Socks obj = socksServices.deleteSocks(socks);
        return obj;
    }
}