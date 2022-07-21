import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void deveColocarItensNoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.setItemAtual(new Item("PS5", 4000));
        carrinho.setItemAtual(new Item("JoyStick", 300));
        carrinho.setItemAtual(new Item("Teclado", 60));
        assertEquals(3,carrinho.getItens().size());
    }

    @Test
    void deveVoltarAoItemInicial() {
        Carrinho carrinho = new Carrinho();
        carrinho.setItemAtual(new Item("PS5", 4000));
        carrinho.setItemAtual(new Item("JoyStick", 300));
        carrinho.setItemAtual(new Item("Teclado", 60));

        carrinho.restauraItem(0);
        assertEquals("PS5", carrinho.getItemAtual().getNome());
    }

    @Test
    void deveVoltarAoItemAnterior() {
        Carrinho carrinho = new Carrinho();
        carrinho.setItemAtual(new Item("PS5", 4000));
        carrinho.setItemAtual(new Item("JoyStick", 300));
        carrinho.setItemAtual(new Item("Teclado", 60));
        carrinho.setItemAtual(new Item("Smartphone", 1400));

        carrinho.restauraItem(2);
        assertEquals("Teclado", carrinho.getItemAtual().getNome());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Carrinho carrinho = new Carrinho();
            carrinho.restauraItem(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}