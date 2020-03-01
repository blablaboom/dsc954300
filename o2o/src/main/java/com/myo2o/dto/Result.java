package com.myo2o.dto;

public class Result<T> {
	private T data;//�ɹ�ʱ���ص�����
	private boolean success;//�Ƿ�ɹ��ı�־
	private String errorMsg;//������Ϣ
	private  int erroeCode;
	
	
	public Result() {
	}
   //�ɹ�ʱ���õĹ�����
	public Result(boolean success,T data) {
		this.success=success;
		this.data=data;}
	//����ʱ���õĹ�����
	public Result(boolean success,int errorCode,String errorMsg) {
	    
		this.success=success;
		this.erroeCode=errorCode;
		this.errorMsg=errorMsg;
	}
		public boolean isSuccess() {
			return success;
			
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public String getErrorMsg() {
			return errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public int getErroeCode() {
			return erroeCode;
		}
		public void setErroeCode(int erroeCode) {
			this.erroeCode = erroeCode;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
	
}

