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
<title>前端开发全国-职位搜索-求职招聘网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="前端开发招聘  全国地区招聘   招聘信息汇总  最新最热门互联网行业招聘信息，尽在求职招聘网" name="description">
<meta content="前端开发招聘,全国地区前端开发招聘,求职招聘招聘,求职招聘网,互联网招聘" name="keywords">
<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link rel="Shortcut Icon" href="http://www.lagou.com/h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css"/>
<link rel="stylesheet" type="text/css" href="style/css/external.min.css"/>
<link rel="stylesheet" type="text/css" href="style/css/popup.css"/>
<link type="text/css" href="style/css/zpageNav.css" rel="stylesheet"/>
<script src="style/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>
<script type="text/javascript" src="style/js/zpageNav.js"></script>
<script src="style/js/util.js"></script>
<style type="text/css">
 .current2{
   background-color: #91cebe;;
}
</style>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
 
 
</head>
<style>
.ui-autocomplete{width:488px;background:#fafafa !important;position: relative;z-index:10;border: 2px solid #91cebe;}
.ui-autocomplete-category{font-size:16px;color:#999;width:50px;position: absolute;z-index:11; right: 0px;/*top: 6px; */text-align:center;border-top: 1px dashed #e5e5e5;padding:5px 0;}
.ui-menu-item{ *width:439px;vertical-align: middle;position: relative;margin: 0px;margin-right: 50px !important;background:#fff;border-right: 1px dashed #ededed;}
.ui-menu-item a{display:block;overflow:hidden;}
</style>
<body>
<div id="listContainer">
	<div id="header">
    	<div class="wrapper">
    		<a href="index.jsp" class="logo">
    			<img src="style/images/logo.png" width="229" height="43" alt="求职招聘招聘-专注互联网招聘" />
    		</a>
    		<ul class="reset" id="navheader">
    			<li class="current"><a href="index.jsp">首页</a></li>
    			<li   ><a href="companylist.jsp" >公司列表</a></li>
    			<li v-if="ident == 0"><a href="jianli.jsp" rel="nofollow">我的简历</a></li>
    			<li v-else-if="ident == 1"><a href="jianli.jsp" rel="nofollow">公司信息</a></li>
    			
	    		<li v-if="ident == 1"><a href="create.jsp" rel="nofollow">发布职位</a></li>
	    		<li v-else-if="ident == 0"><a href="jianli.jsp" rel="nofollow">投递箱</a></li>
			</ul>
	    	
        	<ul class="loginTop"   >
            	<li v-if="ident == 0"><a href="jianli.jsp" rel="nofollow">求职者 ${sessionScope.person.email} </a></li> 
            	<li v-else-if="ident == 1"><a href="mycompany.jsp" rel="nofollow">招聘者${sessionScope.company.email}  </a></li>  
            	<li v-else><a href="login.jsp" rel="nofollow">登录 </a> </li>
            	<li  > |</li>
            	<li><a href="register.jsp" rel="nofollow">注册</a></li>
  			</ul>
        </div>
    </div><!-- end #header -->
    <div id="container">
        
       	<div class="sidebar"  id="sidebar">
       		            <div id="options" class="greybg">
                                <dl >
                   	<dt>月薪范围 <em ></em></dt>
	                <dd >
	                    	                    	<div >2k以下</div>
	                    	                    	<div>2k-5k</div>
	                    	                    	<div>5k-10k</div>
	                    	                    	<div>10k-15k</div>
	                    	                    	<div>15k-25k</div>
	                    	                    	<div>25k-50k</div>
	                    	                    	<div>50k以上</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>工作经验 <em ></em></dt>
	                <dd >
	                    	                    	<div>不限</div>
	                    	                    	<div>应届毕业生</div>
	                    	                    	<div>1年以下</div>
	                    	                    	<div>1-3年</div>
	                    	                    	<div>3-5年</div>
	                    	                    	<div>5-10年</div>
	                    	                    	<div>10年以上</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>最低学历 <em ></em></dt>
	                <dd >
	                    	                    	<div>不限</div>
	                    	                    	<div>大专</div>
	                    	                    	<div>本科</div>
	                    	                    	<div>硕士</div>
	                    	                    	<div>博士</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>工作性质 <em ></em></dt>
	                <dd >
	                    	                    	<div>全职</div>
	                    	                    	<div>兼职</div>
	                    	                    	<div>实习</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt> <em ></em></dt>
	                <dd >
	                    	                    	<div> </div>
	                    	                </dd> 
                </dl>
                            </div>
            
            <!-- QQ群 -->
            	            		            <div class="qq_group">
		            	加入<span>前端</span>QQ群
		            	<div class="f18">跟同行聊聊</div>
		            	<p>1140093781</p>
		            </div>
		                                
            <!-- 对外合作广告位  -->
             	            		        	<a href="http://www.w3cplus.com/" target="_blank" class="partnersAd">
		            	<img src="style/images/w3cplus.png" width="230" height="80" alt="w3cplus" />
		            </a>
		            <a href="" target="_blank" class="partnersAd">
		            	<img src="style/images/jquery_school.jpg" width="230" height="80" alt="JQ学校" />
		            </a>
		                                	            <a href="http://linux.cn/" target="_blank" class="partnersAd">
	            	<img src="style/images/linuxcn.png" width="230" height="80" alt="Linux中文社区"  />
	            </a>
	            <a href="http://zt.zhubajie.com/zt/makesite? utm_source=lagou.com&utm_medium=referral&utm_campaign=BD-yl" target="_blank" class="partnersAd">
	            	<img src="style/images/zhubajie.jpg" width="230" height="80" alt="猪八戒" />
	            </a>
	            <a href="http://www.imooc.com" target="_blank" class="partnersAd">
	            	<img src="style/images/muke.jpg" width="230" height="80" alt="幕课网" />
	            </a>
	        	       	<!-- 	            <a href="http://www.osforce.cn/" target="_blank" class="partnersAd">
	            	<img src="style/images/osf-lg.jpg" width="230" height="80" alt="开源力量"  />
	            </a>
	         -->
        </div>
        
        <div class="content">
        	<div id="search_box">
				<form id="searchForm" name="searchForm" action="list.jsp" method="get">
		        <ul id="searchType">
		        	<li data-searchtype="1" class="type_selected">职位</li>
		        </ul>
		        <div class="searchtype_arrow"></div>
		        <input type="text" id="search_input" name = "kd"  tabindex="1"  v-model="search" placeholder="请输入职位名称，如：产品经理"  />
		        <input type="hidden" name="spc" id="spcInput" value="1"/>
		        <input type="hidden" name="pl" id="plInput" value=""/>
		        <input type="hidden" name="gj" id="gjInput" value=""/>
		        <input type="hidden" name="xl" id="xlInput" value=""/>
		        <input type="hidden" name="yx" id="yxInput" value=""/>
		        <input type="hidden" name="gx" id="gxInput" value="" />
		        <input type="hidden" name="st" id="stInput" value="" />
		        <input type="hidden" name="labelWords" id="labelWords" value="label" />
		        <input type="hidden" name="lc" id="lc" value="" />
		        <input type="hidden" name="workAddress" id="workAddress" value=""/>
		                <input type="hidden" name="city" id="cityInput" value="全国"/>
		                <input type="button" id="search_button" value="搜索" />
		       </form>
           </div>


		<dl class="hotSearch">
			<dt>热门搜索：</dt>
			<dd  v-for="item in hotJobClass" >
				<a href="#"  @click=" searchJob(item.c3name)"  >
				{{item.c3name}}
				</a>
			</dd>
		</dl>			
		<div class="breakline"></div>
		
            <dl class="workplace" id="workplaceSelect">
                <dt class="fl">工作地点：</dt>
               	               	<dd >
                	<a href="javascript:;" class="current">全国</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >北京</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >上海</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >广州</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >深圳</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >成都</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >杭州</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >武汉</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:;" >南京</a> 
                	                	|
                	               	</dd>
               	               	<dd  class="more" id="more" >
                	<a href="javascript:;"  > {{elseCity}}</a> 
                	                	<div class="triangle citymore_arrow"></div>
                	               	</dd>
               	                <dd id="box_expectCity" class="searchlist_expectCity dn">
	            	<span class="bot"></span>
	            	<span class="top"></span>
		    		    <dl>
			    			<dt>ABCDEF</dt>
			    			<dd>
			     						     				<span>北京</span>
			     						     				<span >长春</span>
			     						     				<span>成都</span>
			     						     				<span>重庆</span>
			     						     				<span>长沙</span>
			     						     				<span>常州</span>
			     						     				<span>东莞</span>
			     						     				<span>大连</span>
			     						     				<span>佛山</span>
			     						     				<span>福州</span>
			     						    			</dd>
			    	  	</dl>
			    	  	<dl>
			    			<dt>GHIJ</dt>
			    			<dd>
			     						     				<span>贵阳</span>
			     						     				<span>广州</span>
			     						     				<span>哈尔滨</span>
			     						     				<span>合肥</span>
			     						     				<span>海口</span>
			     						     				<span>杭州</span>
			     						     				<span>惠州</span>
			     						     				<span>金华</span>
			     						     				<span>济南</span>
			     						     				<span>嘉兴</span>
			     						    			</dd>
			    	  	</dl>
			    	  	<dl>
			    			<dt>KLMN</dt>
			    			<dd>
			     						     				<span>昆明</span>
			     						     				<span>廊坊</span>
			     						     				<span>宁波</span>
			     						     				<span>南昌</span>
			     						     				<span>南京</span>
			     						     				<span>南宁</span>
			     						     				<span>南通</span>
			     						    			</dd>
			    	  	</dl>
			    	  	<dl>
			    			<dt>OPQR</dt>
			    			<dd>
			     						     				<span>青岛</span>
			     						     				<span>泉州</span>
			     						    			</dd>
			    	  	</dl>
			    	  	<dl>
			    			<dt>STUV</dt>
			    			<dd>
			     						     				<span>上海</span>
			     						     				<span>石家庄</span>
			     						     				<span>绍兴</span>
			     						     				<span>沈阳</span>
			     						     				<span>深圳</span>
			     						     				<span>苏州</span>
			     						     				<span>天津</span>
			     						     				<span>太原</span>
			     						     				<span>台州</span>
			     						    			</dd>
			    	  	</dl>
			    	  	<dl>
			    			<dt>WXYZ</dt>
			    			<dd>
			     						     				<span>武汉</span>
			     						     				<span>无锡</span>
			     						     				<span>温州</span>
			     						     				<span>西安</span>
			     						     				<span>厦门</span>
			     						     				<span>烟台</span>
			     						     				<span>珠海</span>
			     						     				<span>中山</span>
			     						     				<span>郑州</span>
			     						    			</dd>
			    	  	</dl>
			    	  				    				    </dd>  
            </dl>
         
            
            	     <ul class="hot_pos reset"  id="hot_pos reset">
	                   <li class="clearfix" v-for="item in newJob">
		            	<div class="hot_pos_l">
		                	   <div class="mb10">
		                        <a href="#" target="_blank">{{item.c3Name}}</a> 
		                            &nbsp;
		                        <span class="c9">[{{item.jobcity}}]  </span>
		                        <span class="c9" v-if="item.worktype==0">[全职]  </span>
		                        <span class="c9" v-if="item.worktype==1">[兼职]  </span>
		                        <span class="c9" v-if="item.worktype==2">[实习]  </span>
		                	    </div>
		                        <span><em class="c7">月薪： </em>{{item.salarybegin}}k-{{item.salaryend}}k</span>
		                        <span><em class="c7">经验：</em>{{item.jobexperience}}</span>
		                        <span><em class="c7">最低学历：</em>  
		                            <em v-if="item.education==0">大专</em>
			                        <em v-else-if="item.education==1">本科</em>
			                        <em v-else-if="item.education==2">硕士</em>
			                        <em v-else-if="item.education==3">博士</em>
			                        <em v-else> 不限</em></span>
		                        <br />
		                        <span><em class="c7">职位诱惑：</em>{{item.jobtemptation}}！</span>
		                        <br />
		                        <span><em class="c7">职位描述：</em>{{item.jobdescribe}}！</span>
		                         <br />
		                         <span><em class="c7">具体地点：</em>[{{item.jobaddress}}]</span>
		                         <br />
			                     <span><em class="c7">发布日期：</em>{{item.begintime}}</span>
		                        <!-- <a  class="wb">分享到微博</a> -->
			             </div>
	                	 <div class="hot_pos_r"  >
                	 			<div class="apply" v-if="ident==0" >
		                        <a href="#" @click="delivery(item.jobid)" >投个简历</a>
		                        </div>
                    	        <div class="mb10 recompany"  @click="searchCompany(item.companyName)"><a    >{{item.companyName}}</a></div>
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
	                  </ul>
	                  
			                <!--分页 -->
						<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
							<zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
						</div>
						<!-- 分页结束 -->
            	      </div>	
       
      
  
  

		     <div class="clear"></div>
			 <input type="hidden" id="resubmitToken" value="" />
	    	<a id="backtop" title="回到顶部" rel="nofollow"></a>	
	    	
	    
	  </div>	     <!-- endcontainer  -->               
	</div> <!-- end listContainer -->  
	   
	<div id="footer">
		<div class="wrapper">
			<a href="h/about.jsp" target="_blank" rel="nofollow">联系我们</a>
		    <a href="h/af/zhaopin.jsp" target="_blank">互联网公司导航</a>
		    <a href="http://e.weibo.com/lagou720" target="_blank" rel="nofollow">求职招聘微博</a>
		    <a class="footer_qr" href="javascript:void(0)" rel="nofollow">求职招聘微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou 
			<a target="_blank" href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action">
			京ICP备14023790号-2</a>
			</div>
		</div>
	</div>


<!--  -->
<script type="text/javascript">

    var listvue=new Vue({
        el:'#listContainer',
        data:{
    	 ident:-1,
         email:"",
         hotJobClass : [],
         newJob:[],
         search:'',
         page:1,
         pageSize:15,
         total:100,
         maxPage:9,
         city:'全国',
         elseCity:'其他',
         salaryBegin:0,
         salaryEnd:0,
         jobExp:'不限',
         education:'不限',
         worktype:-1,
         beginTime:''
        },
     
        methods:{
            pageHandler:function(page){
	           this.page=page;
	           var params={"page":page,"row":this.pageSize,"city":this.city,"salaryBegin":this.salaryBegin,
	           "salaryEnd":this.salaryEnd,"jobExp":this.jobExp,"education":this.education,"worktype":this.worktype,
	           "beginTime":this.beginTime,"search":this.search};
	           this.$http.post("getJobList.do",params,{emulateJSON:true}).then(
	              function(res){
	                this.newJob=res.data.list;
	                this.total=res.data.total;
	                this.maxPage=res.data.pages;;
	              },
	              function(res){
	                  console.log(res);
	              } );
			 },
			 searchJob:function(jobName){
			     this.search=jobName;
			 },
			 searchCompany:function(companyName){
                  //!!!!先编码  再传递
           	  window.location.href="companylist.jsp?companyName="+encodeURI(encodeURI(companyName));
             },
			 delivery:function(jobid ){
			 console.log("进入delivery")
			 	var jobId=jobid;
			 	var params={"jobId": jobId};
		 	    this.$http.post("delivery.do",params,{emulateJSON:true}).then(
                function(res){
	                 var line=res.data;
	                 if(line==1){
	                 	alert("简历投递成功,请等待招聘者回复 ");
	                 } 
	                 console.log(line);
	            },
	            function(res){
	               alert("简历投递失败，请勿重复投递");
	                
	            } );
			 }
          },
         watch:{
	            city:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            }, 
	            salaryBegin:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            },
	            jobExp:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            },
	            education:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            },
	            worktype:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            },
	            beginTime:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            },
	            search:function(val,oldval){
	                 //this.pageHandler(1);
	                console.log(this.city+this.salaryBegin+this.salaryEnd+this.jobExp
	                +this.education+this.worktype+this.beginTime+this.search);
	                this.pageHandler(1);	
	            }
	          
            },
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
            	this.ident=${sessionScope.ident}
            	console.log(this.ident+"ident");
            	this.search = decodeURI(getQueryString("jobName"));
            	if(this.search=="null") {this.search=""}
				console.log(this.search+"search");
				this.pageHandler(1);
            	this.$http.post("getHotJobClass.do",   //fun2
                    	{},{emulateJSON:true}).then(
            			function(res){
                			this.hotJobClass=res.data;
            			},
            			function(res){
            				console.log(res);
            			}
            	);
            	 
	            
	            	 
            }
        });

</script>

</body>
<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script src="style/js/ajaxfileupload.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/additional-methods.js"></script>
<script type="text/javascript" src="style/js/search.min.js"></script>
<script type="text/javascript" src="style/js/core.min.js"></script>
<script type="text/javascript" src="style/js/popup.min.js"></script>
<script>
$(function(){
	/***************************
 	 * 分页
 	 */
 	 	
		
	$(".workplace dd").not('.more').children('a').click(function(){
		$('#lc').val(1); 
		var cityName=$(this).html();
		editForm("cityInput" , $(this).html());
		$(this).hasClass("current")?(listvue.city='',$(this).removeClass("current"))
		:($(this).parents('dd').siblings().children().removeClass("current"),
					$(this).addClass("current"));
		listvue.city=cityName;
	});
	
	$("#box_expectCity dd span").click(function(){
		$('#lc').val(1);
		var cityName=$(this).html();
		editForm("cityInput" , $(this).html());
		listvue.elseCity=cityName;
		listvue.city=cityName;
		$("#more").children('a').addClass("current");
		$(".workplace dd").not('.more').children('a').removeClass("current");
	});
	
	$('#options dd div').click(function(){
		var firstName = $(this).parents('dl').children('dt').text();
		var fn = $.trim(firstName);
		if (fn=="月薪范围"){
			editForm("yxInput" , $(this).html());
			
			var salary=$(this).html();
			if(salary=="2k以下") {listvue.salaryBegin=0;listvue.salaryEnd=2}
			if(salary=="2k-5k") {listvue.salaryBegin=2;listvue.salaryEnd=5}
			if(salary=="5k-10k") {listvue.salaryBegin=5;listvue.salaryEnd=10}
			if(salary=="10k-15k") {listvue.salaryBegin=10;listvue.salaryEnd=15}
			if(salary=="15k-25k") {listvue.salaryBegin=15;listvue.salaryEnd=25}
			if(salary=="25k-50k") {listvue.salaryBegin=25;listvue.salaryEnd=50}
			if(salary=="50k以上") {listvue.salaryBegin=50;listvue.salaryEnd=0}
			$(this).hasClass("current2")?($(this).removeClass("current2"),listvue.salaryBegin=0,listvue.salaryEnd=0)
			:($(this).siblings().removeClass("current2"),$(this).addClass("current2"));
			
			
		}
		else if(fn=="工作经验"){
			editForm("gjInput" , $(this).html());
			var jobexp=$(this).html()
			listvue.jobExp=jobexp;
			$(this).hasClass("current2")?($(this).removeClass("current2"),listvue.jobExp="不限")
			:($(this).siblings().removeClass("current2"),
					$(this).addClass("current2"));
		}
		else if(fn=="最低学历"){
			editForm("xlInput" , $(this).html());
			listvue.education= $(this).html();
			$(this).hasClass("current2")?($(this).removeClass("current2"),listvue.education="不限")
			:($(this).siblings().removeClass("current2"),$(this).addClass("current2"));
		}
		else if(fn=="工作性质"){
			editForm("gxInput" , $(this).html());
			var workType=$(this).html();
			console.log("工作性质"+workType);
			if(workType=="全职") {listvue.worktype=0}
			if(workType=="兼职") {listvue.worktype=1}
			if(workType=="实习") {listvue.worktype=2}
			$(this).hasClass("current2")?($(this).removeClass("current2"),listvue.worktype=(-1))
			:($(this).siblings().removeClass("current2"),$(this).addClass("current2"));
		}
		else if(fn=="发布时间"){
			editForm("stInput" , $(this).html());
			listvue.beginTime= $(this).html();
			$(this).hasClass("current2")?$(this).removeClass("current2"):($(this).siblings().removeClass("current2"),
					$(this).addClass("current2"));
		}
	});
	
	$('#selected ul').delegate('li span.select_remove','click',function(event){
		var firstName = $(this).parent('li').find('strong').text();
		var fn = $.trim(firstName);
		if (fn=="月薪范围")
			editForm("yxInput" , "");
		else if(fn=="工作经验")
			editForm("gjInput" , "");
		else if(fn=="最低学历")
			editForm("xlInput" , "");
		else if(fn=="工作性质")
			editForm("gxInput" , "");
		else if(fn=="发布时间")
			editForm("stInput" , "");
	});
	
	/* search结果飘绿	*/
	(function($) {
		var searchVal = $('#search_input').val();
		var reg = /\s/g;     
		searchVal = searchVal.replace(reg, "").split(""); 
		
		var resultL = '';
		var resultR = '';
		$('.hot_pos li').each(function(){
			resultL = $('.hot_pos_l a',this).text().split("");
			$.each(resultL,function(i,v){
				if($.inArray(v.toLowerCase(),searchVal) != -1 || $.inArray(v.toUpperCase(),searchVal) != -1){
					resultL[i] = '<span>'+ v +'</span>';
				}
			});
			$('.hot_pos_l a',this).html(resultL.join(''));
			
			resultR = $('.hot_pos_r .mb10 a',this).text().split("");
			$.each(resultR,function(i,v){
				if($.inArray(v.toLowerCase(),searchVal) != -1 || $.inArray(v.toUpperCase(),searchVal) != -1){
					resultR[i] = '<span>'+ v +'</span>';
				}
			});
			$('.hot_pos_r .mb10 a',this).html(resultR.join(''));
		});
		
	})(jQuery);
	
	//didi tip
   	if($.cookie('didiTip') != 1 && false){
		$('#tip_didi').show();
	}
	$('#tip_didi a').click(function(){
		$(this).parent().remove();
		$.cookie('didiTip',1,{ expires: 30, path: '/'});
	});
	
});

function editForm(inputId,inputValue){
	$("#"+inputId).val(inputValue);
	var keyword = $.trim($('#search_input').val());
	var reg =  /[`~!@\$%\^\&\*\(\)_<>\?:"\{\},\\\/;'\[\]]/ig;
	var re = /#/g;
	var r = /\./g;
	var kw = keyword.replace(reg," ");

	if(kw == ''){
		 
	}else{
		kw = kw.replace(re,'井');
		kw = kw.replace(r,'。');
		 
	}
	//$("#searchForm").submit();
}
</script>

</html>