<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb">
<head>
<script id="allmobilize" charset="utf-8" src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld"  />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>求职招聘网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="" name="description">
<meta content="" name="keywords">
<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<style>
.ui-autocomplete{width:488px;background:#fafafa !important;position: relative;z-index:10;border: 2px solid #91cebe;}
.ui-autocomplete-category{font-size:16px;color:#999;width:50px;position: absolute;z-index:11; right: 0px;/*top: 6px; */text-align:center;border-top: 1px dashed #e5e5e5;padding:5px 0;}
.ui-menu-item{ *width:439px;vertical-align: middle;position: relative;margin: 0px;margin-right: 50px !important;background:#fff;border-right: 1px dashed #ededed;}
.ui-menu-item a{display:block;overflow:hidden;}
</style>
<link rel="Shortcut Icon" href="h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css"/>
<link rel="stylesheet" type="text/css" href="style/css/external.min.css"/>
<link rel="stylesheet" type="text/css" href="style/css/popup.css"/>

<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>

<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
</head>
<style>
[v-cloak] {
    display: none;
}
</style>
<style>
.ui-autocomplete{width:488px;background:#fafafa !important;position: relative;z-index:10;border: 2px solid #91cebe;}
.ui-autocomplete-category{font-size:16px;color:#999;width:50px;position: absolute;z-index:11; right: 0px;/*top: 6px; */text-align:center;border-top: 1px dashed #e5e5e5;padding:5px 0;}
.ui-menu-item{ *width:439px;vertical-align: middle;position: relative;margin: 0px;margin-right: 50px !important;background:#fff;border-right: 1px dashed #ededed;}
.ui-menu-item a{display:block;overflow:hidden;}
</style>
<body>
<div id="body">
<div id="indexContainer">
	<div id="header" >
    	<div class="wrapper">
    		<a href="index.jsp" class="logo">
    			<img src="style/images/logo.png" width="229" height="43" alt="求职招聘招聘-专注互联网招聘" />
    		</a>
    		<ul class="reset" id="navheader">
    			<li class="current"><a href="index.jsp">首页</a></li>
    			<li ><a href="companylist.jsp" >公司列表</a></li>
    			<li v-if="ident == 0"><a href="jianli.jsp" rel="nofollow">我的简历</a></li>
    			<li v-else-if="ident == 1"><a href="mycompany.jsp" rel="nofollow">公司信息</a></li>
    			
	    		<li v-if="ident == 1"><a href="create.jsp" rel="nofollow">发布职位</a></li>
	    		<li v-else-if="ident == 0"><a href="delivery.jsp" rel="nofollow">投递箱</a></li>
			</ul>
	    	
        	<ul class="loginTop"   >
            	<li v-if="ident == 0"><a href="jianli.jsp" rel="nofollow">求职者 ${sessionScope.person.email} </a></li> 
            	<li v-else-if="ident == 1"><a href="mycompany.jsp" rel="nofollow">招聘者${sessionScope.company.email}  </a></li>  
            	<li v-else><a href="login.jsp" rel="nofollow">登录 </a> </li>
            	<li  > |</li>
            	<li><a href="register.jsp" rel="nofollow">退出</a></li>
  			</ul>
        </div>
    </div><!-- end #header -->
    <div id="container">
		<div id="sidebar">
			<div class="mainNavs">
				<div class="menu_box"   v-for="item1  in jobc1c2c3" >
					<div class="menu_main">
						<h2>  {{item1.c1name}}<span></span></h2>
						<a href="#">{{item1.jobc2PojoList[0].c2name}}</a>
						<a href="#">{{item1.jobc2PojoList[0].jobc3List[0].c3name}}</a>
				    </div>
					<div class="menu_sub dn">
						<dl class="reset" v-for="item2  in item1.jobc2PojoList" >
						<dt>
							<a href="#">{{item2.c2name}}</a>
						</dt>
						<dd>
						<a href="#" class="curr"  v-for="item3  in item2.jobc3List" @click="searchJob(item3.c3name)">{{item3.c3name}}</a>
						</dd>
					    </dl>
					</div>
				</div>
			</div>
			<a class="subscribe" href="#" >职位</a>
		</div>
        <div class="content">	
		     <div id="search_box">
			<form id="searchForm"   >
		        <ul id="searchType">
		        	<li data-searchtype="1" class="type_selected">职位</li>
		        	<li data-searchtype="4">公司</li>
		        </ul>
	        <div class="searchtype_arrow"></div>
	        <input type="text" id="search_input" name = "kd"  tabindex="1" value=""
	         v-model="searchContent"  placeholder="请输入职位名称，如：产品经理"   />
	        <input type="hidden" name="spc" id="spcInput" value=""/>
	        <input type="button" id="search_button" value="搜索" @click="searchJobAndCompany()" />
	        </form>
	       </div>

		<dl class="hotSearch">
			 <!-- 热门工作 -->
			<dt>热门搜索：</dt>
			<dd  v-for="item in hotJobClass" >
				<a href="#"  @click=" searchJob(item.c3name)" >
				{{item.c3name}}
				</a>
			</dd>
		</dl>
      		
			<div id="home_banner">
	            <ul class="banner_bg">
	            		                <li  class="banner_bg_1 current" >
	                    <a href="h/subject/s_buyfundation.jsp?utm_source=DH__lagou&utm_medium=banner&utm_campaign=haomai" target="_blank"><img src="style/images/d05a2cc6e6c94bdd80e074eb05e37ebd.jpg" width="612" height="160" alt="好买基金——来了就给100万" /></a>
	                </li>
	                	                <li  class="banner_bg_2" >
	                    <a href="h/subject/s_worldcup.jsp?utm_source=DH__lagou&utm_medium=home&utm_campaign=wc" target="_blank"><img src="style/images/c9d8a0756d1442caa328adcf28a38857.jpg" width="612" height="160" alt="世界杯放假看球，老板我也要！" /></a>
	                </li>
	                	                <li  class="banner_bg_3" >
	                    <a href="h/subject/s_xiamen.jsp?utm_source=DH__lagou&utm_medium=home&utm_campaign=xiamen" target="_blank"><img src="style/images/d03110162390422bb97cebc7fd2ab586.jpg" width="612" height="160" alt="出北京记——第一站厦门" /></a>
	                </li>
	                	            </ul>
	            <div class="banner_control">
	                <em></em> 
	                <ul class="thumbs">
	                		                    <li  class="thumbs_1 current" >
	                        <i></i>
	                        <img src="style/images/4469b1b83b1f46c7adec255c4b1e4802.jpg" width="113" height="42" />
	                    </li>
	                    	                    <li  class="thumbs_2" >
	                        <i></i>
	                        <img src="style/images/381b343557774270a508206b3a725f39.jpg" width="113" height="42" />
	                    </li>
	                    	                    <li  class="thumbs_3" >
	                        <i></i>
	                        <img src="style/images/354d445c5fd84f1990b91eb559677eb5.jpg" width="113" height="42" />
	                    </li>
	                    	                </ul>
	            </div>
	        </div><!--/#main_banner-->
			
        	<ul id="da-thumbs" class="da-thumbs">
	        	  <li  v-for="item in indexCompany">
                    <a href="#" target="_blank">
                        <img :src="item.companylogo" width="112" height="113" alt="联想" />
                        <div class="hot_info">
                        	<h2 title="联想">{{item.companyshortname}}</h2>
                            <em></em>
                            <p title="世界因联想更美好">
                            	{{item.companyprofile}}
                            </p>
                        </div>
                    </a>
	            </li>
            </ul>
            
            <ul class="reset hotabbing">
            	 <li class="current">热门职位</li>
            	 <li>最新职位</li>
            </ul>
            <div id="hotList">
	            <ul class="hot_pos reset">
	            	<li class="  clearfix" v-for="item in hotJob">
		            	<div class="hot_pos_l">
			                        <div class="mb10">
			                         <a href="#" @click="searchJob(item.c3Name)">{{item.c3Name}}</a> 
			                            &nbsp;
			                        <span class="c9">[{{item.jobcity}}]</span>
			                        </div>
			                        <span><em class="c7">月薪： </em>{{item.salarybegin}}k-{{item.salaryend}}k</span>
			                        <span><em class="c7">经验：</em> {{item.jobexperience}}</span>
			                        <span><em class="c7">最低学历： </em>
			                        <em v-if="item.education==0">大专</em>
			                        <em v-else-if="item.education==1">本科</em>
			                        <em v-else-if="item.education==2">硕士</em>
			                        <em v-else-if="item.education==3">博士</em>
			                        <em v-else> 不限</em>
			                        </span>
			                        <br />
			                        <span><em class="c7">职位诱惑：</em>{{item.jobtemptation}}</span>
			                        <br />
				                    <span>{{item.begintime}}</span>
			                        <!-- <a  class="wb">分享到微博</a> -->
			            </div>
			            <div class="hot_pos_r" @click="searchCompany(item.companyName)">
			                    	<div class="mb10 recompany"><a  >{{item.companyName}}</a></div>
			                        <span><em class="c7">领域：</em> {{item.industry}}</span>
			                        <span><em class="c7">创始人：</em>{{item.ceoName}}</span>
			                         <br />
			                        <span><em class="c7">阶段：</em> {{item.development}}</span>
			                        <span><em class="c7">规模：</em>{{item.companySize}}</span>
			                        <ul class="companyTags reset">
				                        <li>{{item.companyTag}}</li>
			          	  		    </ul>
			             </div>
			         </li>
	                 <a href="list.jsp" class="btn fr" target="_blank">查看更多</a>
	            </ul>
	            <ul class="hot_pos hot_posHotPosition reset" style="display:none;">
	            	 <li class="clearfix" v-for="item in newJob">
		            	<div class="hot_pos_l">
			                	   <div class="mb10">
			                        <a href="#"   @click=" searchJob(item.c3Name)">{{item.c3Name}}</a> 
			                            &nbsp;
			                        <span class="c9">[{{item.jobcity}}]</span>
			                	   </div>
			                        <span><em class="c7">月薪： </em>{{item.salarybegin}}k-{{item.salaryend}}k</span>
			                        <span><em class="c7">经验：</em>{{item.jobexperience}}</span>
			                        <span><em class="c7">最低学历：</em> {{item.education}}</span>
			                        <br />
			                        <span><em class="c7">职位诱惑：</em>{{item.jobtemptation}}！</span>
			                        <br />
				                    <span>{{item.begintime}}</span>
			                        <!-- <a  class="wb">分享到微博</a> -->
			             </div>
	                	 <div class="hot_pos_r" @click="searchCompany(item.companyName)">
	                	 	 
	                    	<div class="mb10 recompany"><a    >{{item.companyName}}</a></div>
			                        <span><em class="c7">领域：</em> {{item.industry}}</span>
			                        <span><em class="c7">创始人：</em>{{item.ceoName}}</span>
			                         <br />
			                        <span><em class="c7">阶段：</em> {{item.development}}</span>
			                        <span><em class="c7">规模：</em>{{item.companySize}}</span>
			                        <ul class="companyTags reset">
				                        <li>{{item.companyTag}}</li>
			          	  		    </ul>
	                     </div>
			           </li>
	                 <a href="list.jsp" class="btn fr" target="_blank">查看更多</a>
	            </ul>
            </div>
             
            
 
            <div class="clear"></div>
			<div id="linkbox">
			    <dl>
			        <dt>友情链接</dt>
			        <dd>
			        		<a href="http://www.zhuqu.com/" target="_blank">住趣家居网</a> <span>|</span>
			        		<a href="http://www.woshipm.com/" target="_blank">人人都是产品经理</a> <span>|</span>
			        		<a href="http://zaodula.com/" target="_blank">互联网er的早读课</a> <span>|</span>
			                <a href="http://lieyunwang.com/" target="_blank">猎云网</a> <span>|</span>
			        		<a href="http://www.ucloud.cn/" target="_blank">UCloud</a> <span>|</span>
			          		<a href="http://www.iconfans.com/" target="_blank">iconfans</a>  <span>|</span>
			          		<a href="http://www.jsp5dw.com/" target="_blank">html5梦工厂</a>   <span>|</span>
			          		<a href="http://www.sykong.com/" target="_blank">手游那点事</a> 
			          		
			          		<a href="http://www.mycodes.net/" target="_blank">源码之家</a> <span>|</span>
			          		<a href="http://www.uehtml.com/" target="_blank">uehtml</a> <span>|</span>
			          		<a href="http://www.w3cplus.com/" target="_blank">W3CPlus</a> <span>|</span>
			          		<a href="http://www.boxui.com/" target="_blank">盒子UI</a> <span>|</span>
			          		<a href="http://www.uimaker.com/" target="_blank">uimaker</a> <span>|</span>
			          		<a href="http://www.yixieshi.com/" target="_blank">互联网的一些事</a> <span>|</span>
			          		<a href="http://www.chuanke.com/" target="_blank">传课网</a> <span>|</span>
			          		<a href="http://www.eoe.cn/" target="_blank">安卓开发</a> <span>|</span>
			          		<a href="http://www.eoeandroid.com/" target="_blank">安卓开发论坛</a> 
			          		<a href="http://hao.360.cn/" target="_blank" >360安全网址导航</a> <span>|</span>
			          		<a href="http://se.360.cn/" target="_blank" >360安全浏览器</a> <span>|</span>
			          		<a href="http://www.hao123.com/" target="_blank" >hao123上网导航</a> <span>|</span>
			          		<a href="http://www.ycpai.com" target="_blank" >互联网创业</a><span>|</span>
			          		<a href="http://www.zhongchou.cn" target="_blank" >众筹网</a><span>|</span>
			          		<a href="http://www.marklol.com/" target="_blank" >马克互联网</a><span>|</span>
			          		<a href="http://www.chaohuhr.com/" target="_blank" >巢湖英才网</a>
			          		
			          		<a href="http://www.zhubajie.com/" target="_blank" >创意服务外包</a><span>|</span>
			          		<a href="http://www.thinkphp.cn/" target="_blank" >thinkphp</a><span>|</span>
			          		<a href="http://www.chuangxinpai.com/" target="_blank" >创新派</a><span>|</span>

			          		<a href="http://w3cshare.com/" target="_blank" >W3Cshare</a><span>|</span>
			          		<a href="http://www.518lunwen.cn/" target="_blank" >论文发表网</a><span>|</span>
			          		<a href="http://www.199it.com" target="_blank" >199it</a><span>|</span>

			          		<a href="http://www.shichangbu.com" target="_blank" >市场部网</a><span>|</span>
			          		<a href="http://www.meitu.com/" target="_blank" >美图公司</a><span>|</span>
			          		<a href="https://www.teambition.com/" target="_blank" >Teambition</a>
			          		<a href="http://oupeng.com/" target="_blank" >欧朋浏览器</a><span>|</span>
			          		<a href="http://iwebad.com/" target="_blank">网络广告人社区</a>
			          		<a href="h/af/flink.jsp" target="_blank" class="more">更多</a>
			        </dd>
			    </dl>
			</div>
			 
        </div>	
 	    <input type="hidden" value="" name="userid" id="userid" />
 		<!-- <div id="qrSide"><a></a></div> -->
<!--  -->

<!-- <div id="loginToolBar">
	<div>
		<em></em>
		<img src="style/images/footbar_logo.png" width="138" height="45" />
		<span class="companycount"></span>
		<span class="positioncount"></span>
		<a href="#loginPop" class="bar_login inline" title="登录"><i></i></a>
		<div class="right">
			<a href="register.jsp?from=index_footerbar" onclick="_hmt.push(['_trackEvent', 'button', 'click', 'register'])" class="bar_register" id="bar_register" target="_blank"><i></i></a>
		</div>
		<input type="hidden" id="cc" value="16002" />
		<input type="hidden" id="cp" value="96531" />
	</div>
</div>
 -->
<!-------------------------------------弹窗lightbox  ----------------------------------------->
<div style="display:none;">
	<!-- 登录框 -->
	<div id="loginPop" class="popup" style="height:240px;">
       	<form id="loginForm">
			<input type="text" id="email" name="email" tabindex="1" placeholder="请输入登录邮箱地址" />
			<input type="text" id="password" name="password" tabindex="2" placeholder="请输入密码" />
			<span class="error" style="display:none;" id="beError"></span>
		    <label class="fl" for="remember"><input type="checkbox" id="remember" value="" checked="checked" name="autoLogin" /> 记住我</label>
		    <a href="h/reset.jsp" class="fr">忘记密码？</a>
		    <input type="submit" id="submitLogin" value="登 &nbsp; &nbsp; 录" />
		</form>
		<div class="login_right">
			<div>还没有求职招聘网帐号？</div>
			<a href="register.jsp" class="registor_now">立即注册</a>
		    <div class="login_others">使用以下帐号直接登录:</div>
		    <a href="h/ologin/auth/sina.jsp" target="_blank" id="icon_wb" class="icon_wb" title="使用新浪微博帐号登录"></a>
		    <a href="h/ologin/auth/qq.jsp" class="icon_qq" id="icon_qq" target="_blank" title="使用腾讯QQ帐号登录" ></a>
		</div>
    </div><!--/#loginPop-->
</div>
<!------------------------------------- end ----------------------------------------->

			<div class="clear"></div>
			<input type="hidden" id="resubmitToken" value="" />
	    	<a id="backtop" title="回到顶部" rel="nofollow"></a>
	  </div>	
</div><!-- end #container -->  
</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a href="h/about.jsp" target="_blank" rel="nofollow">联系我们</a>
		    <a href="h/af/zhaopin.jsp" target="_blank">互联网公司导航</a>
		    <a href="http://e.weibo.com/lagou720" target="_blank" rel="nofollow">求职招聘网微博</a>
		    <a class="footer_qr" href="javascript:void(0)" rel="nofollow">求职招聘网微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a target="_blank" href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action">京ICP备14023790号-2</a></div>
		</div>
	</div>


<!-- <script src="style/js/wb.js" type="text/javascript" charset="utf-8"></script>
 -->
<script type="text/javascript">

    var headvue=new Vue({
        el:'#indexContainer',
        data:{
    	 ident:-1,
         email:"",
         sj:"",
         hotJobClass : [],
         jobc1c2c3:[],
         hotJob:[],
         newJob:[],
         indexCompany:[],
         searchContent:''
        },
        methods:{
            payOrder:function(){
        	this.$http.post("payOrder",
                	{"oid":this.orderid,"total":this.total},
                	{emulateJSON:true}).then(
        			function(res){

            			location.href="order_list";
        			},
        			function(res){
        				console.log(res);
        			}
        			);
           },
           searchCompany:function(companyName){
                  //!!!!先编码  再传递
           	  window.location.href="companylist.jsp?companyName="+encodeURI(encodeURI(companyName));
           },
           searchJob:function(jobName){
                  //!!!!先编码  再传递
           	  window.location.href="list.jsp?jobName="+encodeURI(encodeURI(jobName));
           },
           searchJobAndCompany:function(){
               var x = document.getElementsByClassName("type_selected")[0];
               var type=x.innerHTML;
               console.log(type+"type");
               if(type=="公司"){this.searchCompany(this.searchContent);};
               if(type=="职位"){this.searchJob(this.searchContent);};
           	   //
           },
           
               
          },
         
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
            	this.ident=${sessionScope.ident}
            	console.log(this.ident+"ident");
            	
            	this.$http.post("getJobC123Fun2.do",   //获得三级工作分类
                    	{},{emulateJSON:true}).then(
            			function(res){
                			this.jobc1c2c3=res.data;
                		 
            			},
            			function(res){
            				console.log(res);
                        }
            	);
            	
            	
            	this.$http.post("getHotJobClass.do",   //fun2  获得热门工作分类
                    	{},{emulateJSON:true}).then(
            			function(res){
                			this.hotJobClass=res.data;
            			},
            			function(res){
            				console.log(res);
            			}
            	);
            	
            	this.$http.post("getHotJob.do",   //   获得热门工作
                    	{},{emulateJSON:true}).then(
            			function(res){
                			this.hotJob=res.data;
                			  
                			 
            			},
            			function(res){
            				console.log(res);
            			}
            	);
            	this.$http.post("getNewJob.do",    //获得最新工作
                    	{},{emulateJSON:true}).then(
            			function(res){
                			this.newJob=res.data;
            			},
            			function(res){
            				console.log(res);
            			}
            	);
            	this.$http.post("getindexCompany.do",   //获取首页投放的公司
                    	{},{emulateJSON:true}).then(
            			function(res){
                			this.indexCompany=res.data;
            			},
            			function(res){
            				console.log(res);
            			}
            	);
            	
            }
        });

</script>


</body>
<script src="style/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/Chart.min.js"></script> 
<script type="text/javascript" src="style/js/home.min.js"></script>
<script type="text/javascript" src="style/js/count.js"></script>
<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script src="style/js/ajaxfileupload.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/additional-methods.js"></script>
<script type="text/javascript" src="style/js/core.min.js"></script>
<script type="text/javascript" src="style/js/popup.min.js"></script>
<script type="text/javascript" src="style/js/search.min.js"></script>
</html>	