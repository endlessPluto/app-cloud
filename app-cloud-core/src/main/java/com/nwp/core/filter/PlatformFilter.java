package com.nwp.core.filter;

import com.nwp.util.IpconfigUtils;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@SuppressWarnings("unused")
public class PlatformFilter implements Filter {
    @SneakyThrows
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;

        String ipAddress = IpconfigUtils.getIpAddress();
        String ip = IpconfigUtils.getIp(req);
        String macAddress = IpconfigUtils.getMacAddress();
        String os = IpconfigUtils.getOS();
        System.out.println("服务端"+ipAddress);
        System.out.println("客户端"+ip);
        System.out.println("macAddress"+macAddress);
        System.out.println("操作系统"+os);

        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With, token");
        res.setHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Redirect");
    }
}
