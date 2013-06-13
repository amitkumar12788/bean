package com.bdisys.survey.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ExportDataXML {
	private String questionId;
	private QuestionType questionType;
//	private String displayQuestion;
	private String columnHeaders;
	private String customVariables;
//	private Map<String,String> columnHeaderMap=new HashMap<String,String>();
//	private Map<String,String> customVariableMap=new HashMap<String,String>();
	private String questionShort;
	private String rowChoiceId;
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public QuestionType getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
/*	public Map<String, String> getColumnHeaderMap() {
		return columnHeaderMap;
	}
	public void setColumnHeaderMap(Map<String, String> columnHeaderMap) {
		this.columnHeaderMap = columnHeaderMap;
	}
	public Map<String, String> getCustomVariableMap() {
		return customVariableMap;
	}
	public void setCustomVariableMap(Map<String, String> customVariableMap) {
		this.customVariableMap = customVariableMap;
	}
*/	public String getQuestionShort() {
		return questionShort;
	}
	public void setQuestionShort(String questionShort) {
		this.questionShort = questionShort;
	}
	
	
	public String getColumnHeaders() {
		return columnHeaders;
	}
	public void setColumnHeaders(String columnHeaders) {
		this.columnHeaders = columnHeaders;
	}
	public String getCustomVariables() {
		return customVariables;
	}
	public void setCustomVariables(String customVariables) {
		this.customVariables = customVariables;
	}
	
	public String getRowChoiceId() {
		return rowChoiceId;
	}
	public void setRowChoiceId(String rowChoiceId) {
		this.rowChoiceId = rowChoiceId;
	}
	public static void main(String[] args) {
		List<ExportDataXML> edxs=new ArrayList<ExportDataXML>();
		
		
		ExportDataXML edx1=new ExportDataXML();
		edx1.setQuestionId("1");
		edx1.setQuestionType(QuestionType.MULTIPLECHOICE_SINGLEANSWER);
		edx1.setQuestionShort("Test1");
		String ch ="1190@1194@1195"; 
		String cv ="maingroup#@subgroup1#@subgroup3";
		edx1.setColumnHeaders(ch);
		edx1.setCustomVariables(cv);
		edxs.add(edx1);
		/*		
		ExportDataXML edx2=new ExportDataXML();
		edx2.setQuestionId("2");
		edx2.setQuestionType(QuestionType.MULTIPLECHOICE_SINGLEANSWER);
		edx2.setQuestionShort("Test2");
		HashMap<String,String> ch2 = new HashMap<String,String>(); 
		ch2.put("1", "vivek");
		HashMap<String,String> cv2 = new HashMap<String,String>(); 
		cv2.put("1", "vivek");
		edx2.setCustomVariableMap(cv2);
		edx2.setColumnHeaderMap(ch2);
		edxs.add(edx2);
*/		
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Data", ExportDataXML.class);
        System.out.println(xStream.toXML(edxs));
	}
	
	

}
