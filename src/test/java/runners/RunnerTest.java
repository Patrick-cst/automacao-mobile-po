package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Caminho dos arquivos .feature
        glue = {"steps"},                        // Pacote contendo as definições dos passos
        tags = "@regressivo",
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Relatório em HTML
        monochrome = true                        // Saída legível no console
)
public class RunnerTest {
}
