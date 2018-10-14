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
<title>登录-求职招聘网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="求职招聘网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在求职招聘网" name="description">
<meta content="求职招聘,求职招聘网,求职招聘招聘,拉钩, 拉钩网 ,互联网招聘,求职招聘互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 求职招聘官网, 求职招聘百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招" name="keywords">

<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

<!-- <div class="web_root"  style="display:none">h</div> -->
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

<body id="login_bg">
<div id="loginContainer">
	<div class="login_wrapper">
		<div class="login_header">
        	<a href="h/"><img src="style/images/logo_white.png" width="285" height="62" alt="求职招聘招聘" /></a>
            <div id="cloud_s"><img src="style/images/cloud_s.png" width="81" height="52" alt="cloud" /></div>
            <div id="cloud_m"><img src="style/images/cloud_m.png" width="136" height="95"  alt="cloud" /></div>
        </div>
        
    	<input type="hidden" id="resubmitToken" value="" />		
		 <div class="login_box">
        	<form id="loginForm" action="index.jsp" @submit.prevent="checkLogin">
        	  	<ul class="register_radio clearfix">
		            <li class="current">
		            	求职者登录
		              	<input type="radio" value="0" name="type"  v-model="ident"/> 
		               
		            </li>
		            <li>
		           	          招聘者登录
		              	<input type="radio" value="1" name="type"  v-model="ident"/> 
		            </li>
		        </ul> 
				<input type="text" id="email" name="email" value="" tabindex="1" placeholder="请输入登录邮箱地址"  v-model="email"/>
			  	<input type="password" id="password" name="password" tabindex="2" placeholder="请输入密码"   v-model="pwd"/>
				<span class="error" style="display:none;" id="beError"></span>
			    <label class="fl" for="remember"><input type="checkbox" id="remember" value="" checked="checked" name="autoLogin" /> 记住我</label>
			    <a href="reset.jsp" class="fr" target="_blank">忘记密码？</a>
			    
				<!--<input type="submit" id="submitLogin" value="登 &nbsp; &nbsp; 录" />-->
				 
                  <input type="submit" id="submitLogin" value="登 录" />
			    
			    <input type="hidden" id="callback" name="callback" value=""/>
                <input type="hidden" id="authType" name="authType" value=""/>
                <input type="hidden" id="signature" name="signature" value=""/>
                <input type="hidden" id="timestamp" name="timestamp" value=""/>
			</form>
			<div class="login_right">
				<div>还没有求职招聘帐号？</div>
				<a  href="register.jsp"  class="registor_now">立即注册</a>
			    <div class="login_others">使用以下帐号直接登录:</div>
			    <a  href="h/ologin/auth/sina.jsp"  target="_blank" class="icon_wb" title="使用新浪微博帐号登录"></a>
			    <a  href="h/ologin/auth/qq.jsp"  class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录"></a>
			</div>
        </div>
        <div class="login_box_btm"></div>
    </div>
</div>
<script type="text/javascript">
$(function(){
	//验证表单
	$('.register_radio li input').click(function(e){
    		$(this).parent('li').addClass('current').append('<em></em>').siblings().removeClass('current').find('em').remove();
    });
	 	$("#loginForm").validate({
	 		/* onkeyup: false,
	    	focusCleanup:true, */
	        rules: {
	    	   	email: {
	    	    	required: true,
	    	    	email: true
	    	   	},
	    	   	password: {
	    	    	required: true
	    	   	}
	    	},
	    	messages: {
	    	   	email: {
	    	    	required: "请输入登录邮箱地址",
	    	    	email: "请输入有效的邮箱地址，如：vivi@lagou.com"
	    	   	},
	    	   	password: {
	    	    	required: "请输入密码"
	    	   	}
	    	},
	    	submitHandler:function(form){
	    	 } 
		});
})


</script>

<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>
<script type="text/javascript">

    var headvue=new Vue({
        el:'#loginContainer',
        data:{
    	 ident:0,
         email:'',
         pwd:''
        },
        methods:{
            checkLogin:function(){
        	this.$http.post("checkLogin.do",
                	{"ident":this.ident,"email":this.email,"pwd":this.pwd},
                	{emulateJSON:true}).then(
        			function(res){
        			       console.log("suceess"+this.ident+"#"+this.email+"#"+this.pwd)
                           if(res.data.result=="ok"){
								alert("登录成功");
								location.href="index.jsp";
							}else{
								alert("登录失败，请重新提交数据");
							}
            			 
        			},
        			function(res){
        			  console.log("error"+this.ident+"#"+this.email+"#"+this.pwd);
        			  alert("登录失败，请稍后重新提交数据");
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