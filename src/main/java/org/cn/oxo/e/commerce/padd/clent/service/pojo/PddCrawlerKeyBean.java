package org.cn.oxo.e.commerce.padd.clent.service.pojo;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import cn.zy.dev.tools.build.html.HtmlGridDef;
import cn.zy.dev.tools.build.html.ModuleDif;
import cn.zy.dev.tools.build.html.Opt;
import cn.zy.dev.tools.build.html.FieldParams.FieldShow;
import cn.zy.dev.tools.build.html.FieldParams.FieldType;
import cn.zy.dev.tools.db.Table;

@Document(collection = "pdd_crawler_key")
@Table(name = "pdd_crawler_proxy", desc = "SHIRO_ROLE", action = "/admin/crawler/key/")
@ModuleDif(id="crawlerkey",opt= {Opt.search,Opt.add,Opt.update,Opt.delete},action="/admin/crawler/key/")
public class PddCrawlerKeyBean {

	private Long key;

	@HtmlGridDef(name = "提交时间", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Search, FieldShow.Input})
	private Date submitTime;
	
	@HtmlGridDef(name = "提交人ID", fieldType = FieldType.text, fieldShow = {FieldShow.Grid, FieldShow.Search, FieldShow.Input})
	private Long submitterId;
	
	//0:提交 1：可爬 2：正在爬  4：已爬成功
	private int stauts;

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public Long getSubmitterId() {
		return submitterId;
	}

	public void setSubmitterId(Long submitterId) {
		this.submitterId = submitterId;
	}

	public int getStauts() {
		return stauts;
	}

	public void setStauts(int stauts) {
		this.stauts = stauts;
	}

}
