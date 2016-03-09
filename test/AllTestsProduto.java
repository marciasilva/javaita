import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import produto.TestCarrinhoDeCompra;
import produto.TestProduto;
import produto.TestProdutoComTamanho;

/**
 * 
 */

/**
 * @author masilva
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TestCarrinhoDeCompra.class, TestProduto.class, TestProdutoComTamanho.class})
public class AllTestsProduto {

}
