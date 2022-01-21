CREATE DEFINER=`root`@`localhost` PROCEDURE `EN-5723`(in cid int)
BEGIN
SELECT * FROM `fe-local`.payment_schedule where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.payment_history where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.payment_transaction where customer_id=cid;
SELECT * FROM `fe-local`.payment_method where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.user_account where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.user_additional_emails where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.cached_notice where notice_id in (select notice_email_id from `fe-local`.notice_emails where customer_id=cid);
SELECT * FROM `fe-local`.user_notices where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
select * from `fe-local`.email_log where id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.account_logs where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.user_request_permission where user_id in (select user_id from `fe-local`.user where CUSTOMER_ID=cid);
SELECT * FROM `fe-local`.customer_request_permission where customer_id=cid;
SELECT * FROM `fe-local`.customer_notice_permission where customer_id=cid;
SELECT * FROM `fe-local`.customer_product where customer_id=cid;
SELECT * FROM `fe-local`.customer_report where customer_id=cid;
SELECT * FROM `fe-local`.request where customer_id=cid;
SELECT * FROM `fe-local`.user_sites_config_list_view where customer_id = cid;
SELECT * FROM `fe-local`.list_report where customer_id=cid;	
SELECT * FROM `fe-local`.job_proof_details where job_detail_id in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid))
		   );
SELECT * FROM `fe-local`.job_xref_files where JOB_DETAIL_ID in 
		   (SELECT JOB_DETAIL_ID FROM `fe-local`.job_detail where JOB_DETAIL_ID in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid)
		   )));
SELECT * from `fe-local`.job_xref_message where JOB_DETAIL_ID in 
		   (SELECT JOB_DETAIL_ID FROM `fe-local`.job_detail where JOB_DETAIL_ID in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid)
		   )));
SELECT * FROM `fe-local`.job_xref_instruction_files where JOB_DETAIL_ID in 
		   (SELECT JOB_DETAIL_ID FROM `fe-local`.job_detail where JOB_DETAIL_ID in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid)
		   )));
SELECT * FROM `fe-local`.job_xref_extraction where JOB_DETAIL_ID in 
		   (SELECT JOB_DETAIL_ID FROM `fe-local`.job_detail where JOB_DETAIL_ID in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid)
		   )));
SELECT * FROM `fe-local`.job_xref_email where JOB_DETAIL_ID in 
		   (SELECT JOB_DETAIL_ID FROM `fe-local`.job_detail where JOB_DETAIL_ID in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid)
		   )));
SELECT * FROM `fe-local`.job_xref_proofs_specific where JOB_DETAIL_ID in 
		   (SELECT JOB_DETAIL_ID FROM `fe-local`.job_detail where JOB_DETAIL_ID in 
		   (select JOB_DETAIL_ID from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid)
		   )));
SELECT * from `fe-local`.job_detail where CUSTOMER_NOTICE_TYPE_ID in 
		   (SELECT CUSTOMER_NOTICE_TYPE_ID FROM `fe-local`.customer_notice_type where CODE_ID in 
		   (select CODE_ID FROM `fe-local`.customer_code where CUSTOMER_ID=cid));
SELECT * FROM `fe-local`.enotices_job where customer_id=cid;
SELECT * FROM `fe-local`.enotices_document where customer_job_id in 
		   (SELECT customer_job_id FROM `fe-local`.enotices_job where customer_id=cid);
SELECT * FROM `fe-local`.email_job_queue where customer_id=cid;
SELECT * FROM `fe-local`.customer where CUSTOMER_ID=cid;
SELECT * FROM `fe-local`.user where CUSTOMER_ID=cid;


SET @user_path = "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/";
SET @file_path = concat(@user_path,'/',cid,'.sql');
set @q1 = concat("SELECT * FROM `fe-local`.user where CUSTOMER_ID=",cid," INTO OUTFILE '",@file_path,"'");
prepare s1 from @q1;
execute s1;

END