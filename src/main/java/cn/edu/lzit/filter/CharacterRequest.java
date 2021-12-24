package cn.edu.lzit.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

// 继承 默认包装类HttpServletRequestWrapper
class CharacterRequest extends HttpServletRequestWrapper {
    private HttpServletRequest request;
    public CharacterRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }
    // 子类继承父类一定会覆写一些方法，此处用于重写getParamter()方法
    public String getParameter(String name) {
        // 调用被包装对象的getParameter()方法，获得请求参数
        String value = super.getParameter(name);
        if (value == null)
            return null;
        // 判断请求方式
        String method = super.getMethod();
        if ("get".equalsIgnoreCase(method)) {
            try {
                value = new String(value.getBytes("iso-8859-1"), "utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        // 解决乱码后返回结果
        return value;
    }
}
