package uz.pdp.barcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class BarcodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BarcodeApplication.class, args);
    }
}
