//コード11-4 フィルタの例
package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterSample
 */
@WebFilter("/*")  //フィルタにはアノテーションを付与する必要がある。/*は全てのサーブレットクラスのリクエストにフィルタファイルが設定される。
public class FilterSample implements Filter {

    /**
     * Default constructor.
     */
    public FilterSample() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //サーブレットクラスの前処理と後処理をこのメソッド内に記述
		//今回は文字コード指定を設定のためrequestに
        request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); //requestが前処理、responseが後処理
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
