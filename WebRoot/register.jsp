<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<script id="allmobilize" charset="utf-8" src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld"  />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册-求职网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="求职网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在求职网" name="description">
<meta content="求职,求职网,求职招聘,求职招聘, 求职招聘网 ,互联网招聘,求职互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 求职官网, 求职百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招" name="keywords">

<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

 
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link rel="Shortcut Icon" href="h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css"/>

<script src="style/js/jquery.1.10.1.min.js" type="text/javascript"></script>

<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script type="text/javascript" src="style/js/core.min.js"></script>

 
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script type="text/javascript" src="style/js/conv.js"></script>
</head>
 
 
<body backgroundColor="#FF0000" >
    <div  id="registerContainer" >
	<div class="login_wrapper">
		<div class="login_header">
        	<a href="h/"><img src="style/images/logo_white.png" width="285" height="62" alt="求职招聘 " /></a>
            <div id="cloud_s"><img src="style/images/cloud_s.png" width="81" height="52" alt="cloud" /></div>
            <div id="cloud_m"><img src="style/images/cloud_m.png" width="136" height="95"  alt="cloud" /></div>
        </div>
        
    	<input type="hidden" id="resubmitToken" value="9b207beb1e014a93bc852b7ba450db27" />		
		<div class="login_box">
        	<form id="loginForm" @submit.prevent="register">
        		<ul class="register_radio clearfix">
		            <li class="current">
		            	找工作
		              	<input type="radio" value="0" name="type"  v-model="ident"/> 
		               
		            </li>
		            <li>
		           	           招人
		              	<input type="radio" value="1" name="type"  v-model="ident"/> 
		            </li>
		        </ul> 
            	<input type="text" id="email" name="email" tabindex="1" placeholder="请输入常用邮箱地址" v-model="email"/>
                <span class="error" style="display:none;" id="beError"></span>
                <input type="password" id="password" name="password" tabindex="2" placeholder="请输入密码" v-model="pwd" />
            	<label class="fl registerJianJu" for="checkbox">
            		<input type="checkbox" id="checkbox" name="checkbox" checked  class="checkbox valid" />我已阅读并同意<a href="h/privacy.jsp" target="_blank">《求职网用户协议》</a>
           		</label>
                <input type="submit" id="submitLogin" value="注   册" />
                
                <input type="hidden" id="callback" name="callback" value=""/>
                <input type="hidden" id="authType" name="authType" value=""/>
                <input type="hidden" id="signature" name="signature" value=""/>
                <input type="hidden" id="timestamp" name="timestamp" value=""/>
            </form>
            <div class="login_right">
            	<div>已有求职网帐号</div>
            	<a  href="login.jsp"  class="registor_now">直接登录</a>
                <div class="login_others">使用以下帐号直接登录:</div>
                <a  href="h/ologin/auth/sina.jsp"  target="_blank" class="icon_wb" title="使用新浪微博帐号登录"></a>
               	<a  href="h/ologin/auth/qq.jsp"  class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录" ></a>
            </div>
        </div>
        <div class="login_box_btm"></div>
    </div>
    </div>
    <script type="text/javascript">
    
    $(document).ready(function(e) {
    	$('.register_radio li input').click(function(e){
    		$(this).parent('li').addClass('current').append('<em></em>').siblings().removeClass('current').find('em').remove();
    	});
    	
    	$('#email').focus(function(){
    		$('#beError').hide();
    	});
    	//验证表单
	    	 $("#loginForm").validate({
	    	        rules: {
	    	        	type:{
	    	        		required: true
	    	        	},
			    	   	email: {
			    	    	required: true,
			    	    	email: true
			    	   	},
			    	   	password: {
			    	    	required: true,
			    	    	rangelength: [6,16]
			    	   	},
			    	   	checkbox:{required:true}
			    	},
			    	messages: {
			    		type:{
	    	        		required:"请选择使用求职网的目的"
	    	        	},
			    	 	email: {
			    	    	required: "请输入常用邮箱地址",
			    	    	email: "请输入有效的邮箱地址，如：vivi@lagou.com"
			    	   	},
			    	   	password: {
			    	    	required: "请输入密码",
			    	    	rangelength: "请输入6-16位密码，字母区分大小写"
			    	   	},
			    	   	checkbox: {
			    	    	required: "请接受求职网用户协议"
			    	   	}
			    	},
			    	errorPlacement:function(label, element){/* 
			    		if(element.attr("type") == "radio"){
			    			label.insertAfter($(element).parents('ul')).css('marginTop','-20px');
			    		}else if(element.attr("type") == "checkbox"){
			    			label.inserresult.contenttAfter($(element).parent()).css('clear','left');
			    		}else{
			    			label.insertAfter(element);
			    		} */			    		
			    		/*modify nancy*/
			    		if(element.attr("type") == "radio"){
			    			label.insertAfter($(element).parents('ul')).css('marginTop','-20px');
			    		}else if(element.attr("type") == "checkbox"){
			    			label.insertAfter($(element).parent()).css('clear','left');
			    		}else{
			    			label.insertAfter(element);
			    		};	
			    	},
			    	submitHandler:function(form){
			    		 
			        }  
	    	});
    });
  
  
    </script>
<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>

<script type="text/javascript">

    var headvue=new Vue({
        el:'#registerContainer',
        data:{
    	 ident:0,
         email:'',
         pwd:''
        },
        methods:{
            register:function(){
        	this.$http.post("register.do",
                	{"ident":this.ident,"email":this.email,"pwd":this.pwd},
                	{emulateJSON:true}).then(
        			function(res){
        			       console.log("suceess"+this.ident+"#"+this.email+"#"+this.pwd)
                           if(res.data==1){
								alert("注册成功");
								location.href="login.jsp";
							}else{
								alert("注册失败，请重新提交数据");
							}
            			 
        			},
        			function(res){
        			  console.log("error"+this.ident+"#"+this.email+"#"+this.pwd);
        			  alert("注册失败，请重新提交数据");
        			  this.pwd=""
        			}
        			);
                }
          },
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
            //	this.$http.post("getAdminList.do",
              //      	{},
                 //   	{emulateJSON:true}).then(
            		//	function(res){
                //			this.orderitemList=res.data;
              //  			console.log(res.data[0].adminid);
            	//		},
            	//		function(res){
            	//			console.log(res);
            	//		}
            	//		);
            }
        
        });

</script>
</body>
</html>
