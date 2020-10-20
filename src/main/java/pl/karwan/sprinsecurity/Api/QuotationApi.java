package pl.karwan.sprinsecurity.Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karwan.sprinsecurity.Model.Quotation;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotationList;

    public QuotationApi() {
        quotationList = new ArrayList<>();
        quotationList.add(new Quotation("To, że milczę, nie znaczy, że nie mam nic do powiedzenia", "Jonathan Carroll"));
        quotationList.add(new Quotation("Lepiej zaliczać się do niektórych, niż do wszystkich", "Andrzej Sapkowski"));
        quotationList.add(new Quotation("Czytanie książek to najpiękniejsza zabawa, jaką sobie ludzkość wymyśliła", "Wisława Szymborska"));
    }

    @GetMapping("/api")
    public List<Quotation> GetALLQuotation(){
        return quotationList;
    }

    @PostMapping("/api")
    public boolean AddQuotation(@RequestBody Quotation quotation){
        return quotationList.add(quotation);
    }

    @DeleteMapping("/api")
    public void DeletQuotation(@RequestParam int idex){
         quotationList.remove(idex);
    }
}
