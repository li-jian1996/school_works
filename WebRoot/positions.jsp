<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
<script async="" src="style/js/analytics.js"></script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>我发布的职位-招聘服务-求职招聘网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="求职招聘网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在求职招聘网">
<meta name="keywords" content="求职招聘,求职招聘网,求职招聘招聘,拉钩, 拉钩网 ,互联网招聘,求职招聘互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 求职招聘官网, 求职招聘百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">http://www.lagou.com</div> -->
<script type="text/javascript">
var ctx = "http://www.lagou.com";
console.log(1);
</script>
<link href="http://www.lagou.com/images/favicon.ico" rel="Shortcut Icon">
<link href="style/css/style.css" type="text/css" rel="stylesheet">
<link type="text/css" href="style/css/zpageNav.css" rel="stylesheet"/>
<link href="style/css/external.min.css" type="text/css" rel="stylesheet">
<link href="style/css/popup.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>
<script type="text/javascript" src="style/js/jquery.1.10.1.min.js"></script>
<script src="style/js/jquery.lib.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/ajaxfileupload.js"></script>
<script src="style/js/additional-methods.js" type="text/javascript"></script>
<script src="style/js/job_list.min.js" type="text/javascript"></script> 
<script type="text/javascript" src="style/js/zpageNav.js"></script>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script src="style/js/conv.js" type="text/javascript"></script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script></head>
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="http://www.lagou.com/">
    			<img width="229" height="43" alt="求职招聘招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index.jsp">首页</a></li>
    			<li    ><a href="companylist.jsp" >公司列表</a></li>
    			<li v-if="ident == 0"><a href="jianli.jsp" rel="nofollow">我的简历</a></li>
    			<li v-else-if="ident == 1"><a href="mycompany.jsp" rel="nofollow">公司信息</a></li>
    			
	    		<li v-if="ident == 1"><a href="create.jsp" rel="nofollow">发布职位</a></li>
	    		<li v-else-if="ident == 0"><a href="jianli.jsp" rel="nofollow">投递箱</a></li>
	    	 </ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span>  招聘者${sessionScope.company.email}  </span> 
            		<span class="red" id="noticeDot-0"></span>
            		<i></i>
            	</dt>
                                	 
                	 <dd  v-if="company.state==1"><a href="positions.jsp">我发布的职位</a></dd>
                	<dd  v-if="company.state==1"><a href="canInterviewResumes.jsp">我收到的简历</a></dd>
                	<dd class="btm"><a href="mycompany.jsp">我的公司主页</a></dd>
                    <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
               
          </div>
    </div><!-- end #header -->
    <div id="container">
         <div class="sidebar"  id="sidebar">
            	<a class="btn_create" href="create.jsp">发布新职位</a>
                <dl class="company_center_aside">
					<dt>我收到的简历</dt>
						<dd>
							<a href="canInterviewResumes.jsp">待定简历</a>
						</dd>
						<dd>
							<a href="canInterviewResumes1.jsp">已通知面试简历</a>
						</dd>
						<dd>
							<a href="canInterviewResumes2.jsp">不合适简历</a>
						</dd>
					<!--  <dd class="btm">
							<a href="autoFilterResumes.jsp">自动过滤简历</a> 
						</dd>-->
				</dl>
				<dl class="company_center_aside">
						<dt>我发布的职位</dt>
						<dd class="current">
							<a href="positions.jsp">有效职位</a>
						</dd>
						<dd>
							<a href="positions2.jsp">已下线职位</a>
						</dd>
				</dl>
      </div><!-- end .sidebar -->
      
     <div class="content"  id="content">
            	<dl class="company_center_content">
                    <dt>
                        <h1>
                            <em></em>
                                                                     有效职位 <span></span>   
                        </h1>
                    </dt>
                    <dd>
                    <form id="searchForm">
	                     
			                	<ul class="reset my_jobs">
				                		 <li data-id="149594" v-for="item in jobList">
		                                    <h3>
		                                        <a target="_blank"   href=" ">{{item.c3Name}}</a> 
		                                        <span>[ {{item.jobcity}} ]</span>
		                                    </h3>
		                                    <!--   <span class="receivedResumeNo"><a href="unHandleResumes.jsp?positionId=149594">应聘简历（1）</a></span>-->
		                                  	 <div>
			                                  	  <a v-if="item.worktype==0"   >全职</a>
			                                  	  <a v-if="item.worktype==1">兼职</a>
			                                  	  <a v-if="item.worktype==2" >实习</a> 
			                                  	    / 
			                                  	 {{item.salarybegin}}-{{item.salaryend}}k / 
			                                  	 {{item.jobexperience}} / 
			                                  	  <a v-if="item.education==0"  >大专</a>
			                                  	  <a v-if="item.education==1">本科</a>
			                                  	  <a v-if="item.education==2" >硕士</a>
			                                  	  <a v-if="item.education==3" >博士</a>
			                                  	  <a v-if="item.education==4" >其他</a>
			                                  	   
		                                  	 </div>
		                                     <div class="c9">发布时间：  {{item.begintime}}</div>
		                                     
			                                 <div class="links">
			                                      <a target="_blank"  @click="editJob(item.jobid)"   >编辑</a>
			                                      <a   @click="endJob(item.jobid)" >结束招聘</a>                       
			                                      <a   @click="delJob(item.jobid)" >删除</a>
		                                    </div>
		                                  </li>
	                               </ul>
			          </form>
		             </dd>
                </dl>
                  <!--分页 -->
						<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
							<zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
						</div>
						<!-- 分页结束 -->
            </div><!-- end .content -->

			<div class="clear"></div>
			<input type="hidden" value="74fb1ce14ebf4e2495270b0fbad64704" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop"></a>
	 </div><!-- end #container -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="about.jsp">联系我们</a>
		    <a target="_blank" href="http://www.lagou.com/af/zhaopin.jsp">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">求职招聘微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">求职招聘微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>
</div><!-- end #body -->
	
	

<script type="text/javascript">

    var positionsvue=new Vue({
        el:'#body',
        data:{
    	 ident:-1,
         email:"",
         status:'',
         isChangeImag:0,
         page:1,
         pageSize:5,
         total:100,
         maxPage:9,
         company:{
         "companyid":541640,
         "email":"qyin@meng.org",
         "pwd":"QUQA6268571315097",
         "companyname":"创亿科技有限公司",
         "companyshortname":"创亿科技",
         "companylogo":"u=550406120,2112605406&fm=27&gp=0.jpg",
         "companywebsite":"http://www.du.com/",
         "city":"永安市","industry":"培训经理/主管",
         "companysize":"2000人以上",
         "development":"天使轮",
         "companytag":"薪酬激励",
         "companyidimage":"KGAF0783038799592.mp3",
         "ceoname":"劳梅","ceointroduced":"之后直接信息.",
         "ceoimage":"MECX9722245983748.css",
         "productimage":"MECX9722245983748.css",
         "productname":"国讯",
         "producturl":"https://www.lei.net/",
         "productintroduction":"数据知道文化能够.",
         "companyprofile":" 容.支持是 .",
         "state":0
         },
         job:{
         "jobid": 0,
         "companyid":98525577,
         "c3id": 0,
         "departments":"" ,
         "worktype":1,
         "education":1,
         "jobtemptation":"",
         "jobdescribe":"",
         "jobaddress":"",
         "jobemail":" ",
         "salarybegin":0 ,
         "salaryend": 0,
         "jobcity":" ",
         "jobexperience":" ",
         "begintime":"  ",
         "endtime":"  ",
         "hits":0,
         "state":1,
         },
          
         jobList:[],
         jobListC3name:["1","2","3"],
         jobc1c2c3:[],
        
         
        },
        watch:{
        	job: {
	                  
	                handler(val, oldVal){
	                		
	                	 
			         },
		        	  deep:true
		        		
		           },         
	                  
	            
        
        },
        methods:{
            
           getC3id:function( id){
           			this.job.c3id=id;
           			console.log("c3id is"+this.job.c3id);
           },
           endJob:function(jobid){
           			this.$http.post("endJob.do",   //获得职位信息
			                	{'jobid1': jobid},{emulateJSON:true}).then(
			        			function(res){
			            			 alert("结束职位成功");
			            			 
			        			},
			        			function(res){
			        				alert("结束职位失败");
			                    }
					        );  //end  
           },
           delJob:function(jobid){
           			this.$http.post("delJob.do",   //获得职位信息
			                	{'jobid1': jobid},{emulateJSON:true}).then(
			        			function(res){
			            			 alert("删除职位成功");
			            			 
			        			},
			        			function(res){
			        				alert("删除职位失败");
			                    }
					        );  //end  
           },
           editJob:function(jobid){
           			 window.location.href="create.jsp?jobid="+jobid;
           },
           getC3Name:function(c3id1,i){
           			var c3name="";
           			console.log("C3ID#"+c3id1)
           			this.$http.post("getC3Name.do",   //获得职位信息
			                	{'c3id': c3id1},{emulateJSON:true}).then(
			        			function(res){
			        				  
			            			 c3name=res.data.c3name;
			            			// this.jobListC3name[i]=c3name;
			            			// this.jobListC3name[2]="ww";
			            			 this.jobList[i].c3name=c3name;
			            			  
			            			 console.log("正在解析C3NAME"+this.jobList[i].c3name);
			            			 
			        			},
			        			function(res){
			        				alert("发生了一些错误");
			                    }
					        );  //end  
					return  c3name;		        
           },
           getC3Name2(id,index){
           			 c3name="名称";
           			 
           			this.$http.post("getC3Name.do",   //获得职位信息
			                	{'c3id': id},{emulateJSON:true}).then(
			        			function(res){
			        				 
			            			 this.c3name=res.data.c3name;
			            			 this.jobListC3name[index]=res.data.c3name;
			            			 this.c3name=res.data.c3name;
			            			 console.log("c3name!"+this.jobListC3name[index]);
			            			 
			        			},
			        			function(res){
			        				alert("发生了一些错误");
			                    }
					        );  //end
					 
           },
           pageHandler:function(page){
	           this.page=page;
	           var params={'companyid': this.company.companyid,"state":1,"page": this.page,"row":this.pageSize};
	           this.$http.post("getJoblistByConmpanyId.do",params,{emulateJSON:true}).then(
	              function(res){
	                this.jobList=res.data.list;
	                this.total=res.data.total;
	                this.maxPage=res.data.pages;;
	              },
	              function(res){
	                  console.log(res);
	              } );
			 },
                 
           
       },
         
        created:function(){
        	//created代表当页面加载完成，立刻执行后面的方法
        	//发生Ajax请求
        	//Vue.http.options.content-Type = "application/json";
        	this.ident=(-1),
        	this.ident='${sessionScope.ident}' ;
        	if(this.ident!=0){   };
        	console.log(this.ident+"ident"),
        	this.company.email='${sessionScope.company.email}',
        	
        	this.$http.post("getCompanyByEmail.do",   //获得公司信息
                	{'email': this.company.email},{emulateJSON:true}).then(
        			function(res){
            			this.company=res.data;
            			this.job.companyid=this.company.companyid;
            			this.job.jobemail=this.company.email;
            			this.pageHandler(1);
	            			 
				        
				        
			        	   
        			},
        			function(res){
        				console.log(res);
                    }
        	);
        	
        	
        	
        	
        	 
            	
            
        	
        	
        	
        }  //end created
    });

</script>
	








<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>
<script src="style/js/tongji.js" type="text/javascript"></script>
<!--  -->

<script src="style/js/analytics01.js" type="text/javascript"></script><script type="text/javascript" src="style/js/h.js"></script>
<script type="text/javascript">
$(function(){
	$('#noticeDot-1').hide();
	$('#noticeTip a.closeNT').click(function(){
		$(this).parent().hide();
	});
});
var index = Math.floor(Math.random() * 2);
var ipArray = new Array('42.62.79.226','42.62.79.227');
var url = "ws://" + ipArray[index] + ":18080/wsServlet?code=314873";
var CallCenter = {
		init:function(url){
			var _websocket = new WebSocket(url);
			_websocket.onopen = function(evt) {
				console.log("Connected to WebSocket server.");
			};
			_websocket.onclose = function(evt) {
				console.log("Disconnected");
			};
			_websocket.onmessage = function(evt) {
				//alert(evt.data);
				var notice = jQuery.parseJSON(evt.data);
				if(notice.status[0] == 0){
					$('#noticeDot-0').hide();
					$('#noticeTip').hide();
					$('#noticeNo').text('').show().parent('a').attr('href',ctx+'/mycenter/delivery.jsp');
					$('#noticeNoPage').text('').show().parent('a').attr('href',ctx+'/mycenter/delivery.jsp');
				}else{
					$('#noticeDot-0').show();
					$('#noticeTip strong').text(notice.status[0]);
					$('#noticeTip').show();
					$('#noticeNo').text('('+notice.status[0]+')').show().parent('a').attr('href',ctx+'/mycenter/delivery.jsp');
					$('#noticeNoPage').text(' ('+notice.status[0]+')').show().parent('a').attr('href',ctx+'/mycenter/delivery.jsp');
				}
				$('#noticeDot-1').hide();
			};
			_websocket.onerror = function(evt) {
				console.log('Error occured: ' + evt);
			};
		}
};
CallCenter.init(url);
</script>

<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div></body></html>