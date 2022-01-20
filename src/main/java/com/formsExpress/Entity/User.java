package com.formsExpress.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	enum REG_TYPE
	{
		Migrated,Signup,Facebook;
	}
	
	public User() {
		
	}
	
	@Id
	private int user_id;
	private String first_name;
	private String other_name;
	private String last_name;
	private String email;
	private String username;
	private String password;
	private String PASSWORD_SALT;
	private String PHONE;
	private String MOBILE;
	private Date DATE_OF_BIRTH;
	private String PROFILE_PICTURE;
	private String PROFILE_PICTURE_FILENAME;
	private String PREFERRED_TIME_FORMAT;
	private char DELIVERY_METHOD;
	private char EMAIL_TYPE;
	public User(int user_id, String first_name, String other_name, String last_name, String email, String username,
			String password, String pASSWORD_SALT, String pHONE, String mOBILE, Date dATE_OF_BIRTH,
			String pROFILE_PICTURE, String pROFILE_PICTURE_FILENAME, String pREFERRED_TIME_FORMAT, char dELIVERY_METHOD,
			char eMAIL_TYPE, int uSER_TYPE_ID, int cUSTOMER_ID, Date lOGGEDIN_DATE, Date lAST_LOGGEDIN_DATE,
			String tOKEN, Date tOKEN_EXPIRATION_DATE, char tOKEN_IS_USED, char iS_PROFILE_UPDATED, char sTATUS,
			com.formsExpress.Entity.User.REG_TYPE rEG_TYPE, int verified, String dASHBOARD_JOB_STATUS,
			Date pASSWORD_MODIFIED_DATE, String aDDRESS, int lOGINS, int lOGIN_ATTEMPTS, int created_by,
			Date cREATED_DATE, int modified_by, Date mODIFIED_DATE, Date eMAIL_VERIFIED_DATE, String agent_code,
			String fB_ID, String email_notice_key, int attachment_max_size) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.other_name = other_name;
		this.last_name = last_name;
		this.email = email;
		this.username = username;
		this.password = password;
		PASSWORD_SALT = pASSWORD_SALT;
		PHONE = pHONE;
		MOBILE = mOBILE;
		DATE_OF_BIRTH = dATE_OF_BIRTH;
		PROFILE_PICTURE = pROFILE_PICTURE;
		PROFILE_PICTURE_FILENAME = pROFILE_PICTURE_FILENAME;
		PREFERRED_TIME_FORMAT = pREFERRED_TIME_FORMAT;
		DELIVERY_METHOD = dELIVERY_METHOD;
		EMAIL_TYPE = eMAIL_TYPE;
		USER_TYPE_ID = uSER_TYPE_ID;
		CUSTOMER_ID = cUSTOMER_ID;
		LOGGEDIN_DATE = lOGGEDIN_DATE;
		LAST_LOGGEDIN_DATE = lAST_LOGGEDIN_DATE;
		TOKEN = tOKEN;
		TOKEN_EXPIRATION_DATE = tOKEN_EXPIRATION_DATE;
		TOKEN_IS_USED = tOKEN_IS_USED;
		IS_PROFILE_UPDATED = iS_PROFILE_UPDATED;
		STATUS = sTATUS;
		REG_TYPE = rEG_TYPE;
		this.verified = verified;
		DASHBOARD_JOB_STATUS = dASHBOARD_JOB_STATUS;
		PASSWORD_MODIFIED_DATE = pASSWORD_MODIFIED_DATE;
		ADDRESS = aDDRESS;
		LOGINS = lOGINS;
		LOGIN_ATTEMPTS = lOGIN_ATTEMPTS;
		this.created_by = created_by;
		CREATED_DATE = cREATED_DATE;
		this.modified_by = modified_by;
		MODIFIED_DATE = mODIFIED_DATE;
		EMAIL_VERIFIED_DATE = eMAIL_VERIFIED_DATE;
		this.agent_code = agent_code;
		FB_ID = fB_ID;
		this.email_notice_key = email_notice_key;
		this.attachment_max_size = attachment_max_size;
	}
	private int USER_TYPE_ID;
	private int CUSTOMER_ID;
	private Date LOGGEDIN_DATE;
	private Date LAST_LOGGEDIN_DATE;
	private String TOKEN;
	private Date TOKEN_EXPIRATION_DATE;
	private char TOKEN_IS_USED;
	private char IS_PROFILE_UPDATED;
	private char STATUS;
	private REG_TYPE REG_TYPE;
	private int verified;
	private String DASHBOARD_JOB_STATUS;
	private Date PASSWORD_MODIFIED_DATE;
	private String ADDRESS;
	private int LOGINS;
	private int LOGIN_ATTEMPTS;
	private int created_by;
	private Date CREATED_DATE;
	private int modified_by;
	private Date MODIFIED_DATE;
	private Date EMAIL_VERIFIED_DATE;
	private String agent_code;
	private String FB_ID;
	private String email_notice_key;
	private int attachment_max_size;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getOther_name() {
		return other_name;
	}
	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPASSWORD_SALT() {
		return PASSWORD_SALT;
	}
	public void setPASSWORD_SALT(String pASSWORD_SALT) {
		PASSWORD_SALT = pASSWORD_SALT;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getMOBILE() {
		return MOBILE;
	}
	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
	}
	public Date getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}
	public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}
	public String getPROFILE_PICTURE() {
		return PROFILE_PICTURE;
	}
	public void setPROFILE_PICTURE(String pROFILE_PICTURE) {
		PROFILE_PICTURE = pROFILE_PICTURE;
	}
	public String getPROFILE_PICTURE_FILENAME() {
		return PROFILE_PICTURE_FILENAME;
	}
	public void setPROFILE_PICTURE_FILENAME(String pROFILE_PICTURE_FILENAME) {
		PROFILE_PICTURE_FILENAME = pROFILE_PICTURE_FILENAME;
	}
	public String getPREFERRED_TIME_FORMAT() {
		return PREFERRED_TIME_FORMAT;
	}
	public void setPREFERRED_TIME_FORMAT(String pREFERRED_TIME_FORMAT) {
		PREFERRED_TIME_FORMAT = pREFERRED_TIME_FORMAT;
	}
	public char getDELIVERY_METHOD() {
		return DELIVERY_METHOD;
	}
	public void setDELIVERY_METHOD(char dELIVERY_METHOD) {
		DELIVERY_METHOD = dELIVERY_METHOD;
	}
	public char getEMAIL_TYPE() {
		return EMAIL_TYPE;
	}
	public void setEMAIL_TYPE(char eMAIL_TYPE) {
		EMAIL_TYPE = eMAIL_TYPE;
	}
	public int getUSER_TYPE_ID() {
		return USER_TYPE_ID;
	}
	public void setUSER_TYPE_ID(int uSER_TYPE_ID) {
		USER_TYPE_ID = uSER_TYPE_ID;
	}
	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public Date getLOGGEDIN_DATE() {
		return LOGGEDIN_DATE;
	}
	public void setLOGGEDIN_DATE(Date lOGGEDIN_DATE) {
		LOGGEDIN_DATE = lOGGEDIN_DATE;
	}
	public Date getLAST_LOGGEDIN_DATE() {
		return LAST_LOGGEDIN_DATE;
	}
	public void setLAST_LOGGEDIN_DATE(Date lAST_LOGGEDIN_DATE) {
		LAST_LOGGEDIN_DATE = lAST_LOGGEDIN_DATE;
	}
	public String getTOKEN() {
		return TOKEN;
	}
	public void setTOKEN(String tOKEN) {
		TOKEN = tOKEN;
	}
	public Date getTOKEN_EXPIRATION_DATE() {
		return TOKEN_EXPIRATION_DATE;
	}
	public void setTOKEN_EXPIRATION_DATE(Date tOKEN_EXPIRATION_DATE) {
		TOKEN_EXPIRATION_DATE = tOKEN_EXPIRATION_DATE;
	}
	public char getTOKEN_IS_USED() {
		return TOKEN_IS_USED;
	}
	public void setTOKEN_IS_USED(char tOKEN_IS_USED) {
		TOKEN_IS_USED = tOKEN_IS_USED;
	}
	public char getIS_PROFILE_UPDATED() {
		return IS_PROFILE_UPDATED;
	}
	public void setIS_PROFILE_UPDATED(char iS_PROFILE_UPDATED) {
		IS_PROFILE_UPDATED = iS_PROFILE_UPDATED;
	}
	public char getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(char sTATUS) {
		STATUS = sTATUS;
	}
	public REG_TYPE getREG_TYPE() {
		return REG_TYPE;
	}
	public void setREG_TYPE(REG_TYPE rEG_TYPE) {
		REG_TYPE = rEG_TYPE;
	}
	public int getVerified() {
		return verified;
	}
	public void setVerified(int verified) {
		this.verified = verified;
	}
	public String getDASHBOARD_JOB_STATUS() {
		return DASHBOARD_JOB_STATUS;
	}
	public void setDASHBOARD_JOB_STATUS(String dASHBOARD_JOB_STATUS) {
		DASHBOARD_JOB_STATUS = dASHBOARD_JOB_STATUS;
	}
	public Date getPASSWORD_MODIFIED_DATE() {
		return PASSWORD_MODIFIED_DATE;
	}
	public void setPASSWORD_MODIFIED_DATE(Date pASSWORD_MODIFIED_DATE) {
		PASSWORD_MODIFIED_DATE = pASSWORD_MODIFIED_DATE;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public int getLOGINS() {
		return LOGINS;
	}
	public void setLOGINS(int lOGINS) {
		LOGINS = lOGINS;
	}
	public int getLOGIN_ATTEMPTS() {
		return LOGIN_ATTEMPTS;
	}
	public void setLOGIN_ATTEMPTS(int lOGIN_ATTEMPTS) {
		LOGIN_ATTEMPTS = lOGIN_ATTEMPTS;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Date cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public int getModified_by() {
		return modified_by;
	}
	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}
	public Date getMODIFIED_DATE() {
		return MODIFIED_DATE;
	}
	public void setMODIFIED_DATE(Date mODIFIED_DATE) {
		MODIFIED_DATE = mODIFIED_DATE;
	}
	public Date getEMAIL_VERIFIED_DATE() {
		return EMAIL_VERIFIED_DATE;
	}
	public void setEMAIL_VERIFIED_DATE(Date eMAIL_VERIFIED_DATE) {
		EMAIL_VERIFIED_DATE = eMAIL_VERIFIED_DATE;
	}
	public String getAgent_code() {
		return agent_code;
	}
	public void setAgent_code(String agent_code) {
		this.agent_code = agent_code;
	}
	public String getFB_ID() {
		return FB_ID;
	}
	public void setFB_ID(String fB_ID) {
		FB_ID = fB_ID;
	}
	public String getEmail_notice_key() {
		return email_notice_key;
	}
	public void setEmail_notice_key(String email_notice_key) {
		this.email_notice_key = email_notice_key;
	}
	public int getAttachment_max_size() {
		return attachment_max_size;
	}
	public void setAttachment_max_size(int attachment_max_size) {
		this.attachment_max_size = attachment_max_size;
	}

}
