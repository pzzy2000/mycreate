package org.cn.oxo.e.commerce.padd.clent.service.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import cn.zy.dev.tools.build.html.FieldParams.FieldShow;
import cn.zy.dev.tools.build.html.FieldParams.FieldType;
import cn.zy.dev.tools.build.html.HtmlGridDef;
import cn.zy.dev.tools.build.html.ModuleDif;
import cn.zy.dev.tools.build.html.Opt;
import cn.zy.dev.tools.db.Table;

@Document(collection = "pdd_crawler_proxy")
@Table(name = "pdd_crawler_proxy", desc = "SHIRO_ROLE", action = "/admin/crawler/proxy/")
@ModuleDif(id="crawlerproxy",opt= {Opt.search,Opt.add,Opt.update,Opt.delete},action="/admin/crawler/proxy/")
public class PddCrawlerProxyBean {
	
	
	public static enum CrawlerProxyStatus{
		stopFail,	stopSuccess,startUpFail,startUpSuccess,NotLogin,Login
	}

	@Id
	private String uuid;

	@HtmlGridDef(name = "代理服务器", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Search, FieldShow.Input})
	private String proxyServerHost;

	@HtmlGridDef(name = "代理服务器端口", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Input})
	private int proxyServerPort;

	@HtmlGridDef(name = "代理客服端口", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Input})
	private int proxyClientPort;

	@HtmlGridDef(name = "登录账号", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Search,FieldShow.Input})
	private String phone;

	@HtmlGridDef(name = "登录账号", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Input})
	private String proxyClientId;
	
	@HtmlGridDef(name = "Chrome数据路径", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Input})
	private String chromePath;
	// -1 启动失败  0: 初始化  1 没登录 2：登录
	@HtmlGridDef(name = "Chrome状态", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Search,FieldShow.Input})
	private CrawlerProxyStatus  status;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProxyServerHost() {
		return proxyServerHost;
	}

	public void setProxyServerHost(String proxyServerHost) {
		this.proxyServerHost = proxyServerHost;
	}

	public int getProxyServerPort() {
		return proxyServerPort;
	}

	public void setProxyServerPort(int proxyServerPort) {
		this.proxyServerPort = proxyServerPort;
	}

	public int getProxyClientPort() {
		return proxyClientPort;
	}

	public void setProxyClientPort(int proxyClientPort) {
		this.proxyClientPort = proxyClientPort;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getProxyClientId() {
		return proxyClientId;
	}

	public void setProxyClientId(String proxyClientId) {
		this.proxyClientId = proxyClientId;
	}

	
	public CrawlerProxyStatus getStatus() {
		return status;
	}

	public void setStatus(CrawlerProxyStatus status) {
		this.status = status;
	}

	public String getChromePath() {
		return chromePath;
	}

	public void setChromePath(String chromePath) {
		this.chromePath = chromePath;
	}

}
