import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

    /**
     * @author LucasRocha
     * @param arg1 Este é o primeiro parametro.
     * @throws Throwable.
     */
public class Conta {

    /**
     * Define um passo onde um cliente especial possui um saldo atual negativo.
     * 
     * @param arg1 O saldo atual do cliente em valor negativo.
     * @throws Throwable Se houver um erro durante a execução do passo.
     */
    @Given("^um cliente é especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_é_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Define um passo onde é solicitado um saque de um valor específico.
     * 
     * @param arg1 O valor a ser sacado.
     * @throws Throwable Se houver um erro durante a execução do passo.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Define um passo onde o saque é realizado e o saldo da conta é atualizado para um valor negativo específico.
     * 
     * @param arg1 O saldo atualizado da conta em valor negativo.
     * @throws Throwable Se houver um erro durante a execução do passo.
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Define um passo para verificar resultados adicionais após realizar transações.
     * 
     * @throws Throwable Se houver um erro durante a execução do passo.
     */
    @Then("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}