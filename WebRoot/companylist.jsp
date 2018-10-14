<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb">
<head>
<script id="allmobilize" charset="utf-8" src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld"  />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>全国-公司列表-拉勾网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="全国condition-condition-公司列表-拉勾网-最专业的互联网招聘平台" name="description">
<meta content="全国condition-公司列表-拉勾网-最专业的互联网招聘平台" name="keywords">
<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link rel="Shortcut Icon" href="h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css"/>
<link rel="stylesheet" type="text/css" href="style/css/external.min.css"/>
<link rel="stylesheet" type="text/css" href="style/css/popup.css"/>
<link type="text/css" href="style/css/zpageNav.css" rel="stylesheet"/>
<script src="style/js/util.js"></script>
<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>
<script src="style/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/zpageNav.js"></script>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script type="text/javascript" src="style/js/conv.js"></script>
<style>
[v-cloak] {
    display: none;
}
</style>
</head>
<body>
<div id="body">
	<div id="header" >
    	<div class="wrapper">
    		<a href="index.jsp" class="logo">
    			<img src="style/images/logo.png" width="229" height="43" alt="拉勾招聘-专注互联网招聘" />
    		</a>
    		<ul class="reset" id="navheader">
    			<li><a href="index.jsp">首页</a></li>
    			<li   class="current"><a href="companylist.jsp" >公司列表</a></li>
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
            	<li><a href="login.jsp" rel="nofollow">退出</a></li>
  			</ul>
        </div>
    </div><!-- end #header -->
    <div id="container">
        
      <div class="clearfix">
            <div class="content_l">
            	<form id="companyListForm" name="companyListForm" method="get"  >
	                <input type="hidden" id="city" name="city"  />
	                <input type="hidden" id="fs" name="fs" value="" />
	                <input type="hidden" id="ifs" name="ifs" value="" />
	                <input type="hidden" id="ol" name="ol" value="" />
	                <dl class="hc_tag">
	                    <dt>
	                       <!--  <h2 class="fl">热门公司</h2> -->
	                        <ul class="workplace reset fr" id="workplaceSelect">
	                        <li ><a href="javascript:void(0)"  class="current" >全国</a> |</li>
	                        <li ><a href="javascript:void(0)" >北京</a> | </li>
	                        <li ><a href="javascript:void(0)" >上海</a> |</li>
	                        <li ><a href="javascript:void(0)" >广州</a> |</li>
	                        <li ><a href="javascript:void(0)" >深圳</a> |</li>
	                        <li ><a href="javascript:void(0)" >成都</a> |</li>
	                        <li ><a href="javascript:void(0)" >杭州</a> |</li>
	                        <li ><a href="javascript:void(0)" >武汉</a> |</li>
	                        <li ><a href="javascript:void(0)" >南京</a> |</li>
	                        <li  class="more" ><a href="javascript:void(0)" >其他</a> 
                            <div class="triangle citymore_arrow"></div>
                            </li>
	                        <li id="box_expectCity" class="searchlist_expectCity dn">
					            	<span class="bot"></span>
					            	<span class="top"></span>
						    			<dl>
							    			<dt>ABCDEF</dt>
							    			<dd>
								     			<span>北京</span>
							     				<span>长春</span>
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
							    	   </li>
	                        </ul>
	                    </dt>
	                    
	                    <dd>
	                        <dl>
	                            <dt>发展阶段：</dt>
	                            <dd>
		                         	<a href="javascript:void(0)">未融资</a>
			  	                    <a href="javascript:void(0)">天使轮</a>
			  	                    <a href="javascript:void(0)">A轮</a>
			  	                    <a href="javascript:void(0)">B轮</a>
			  	                    <a href="javascript:void(0)">C轮</a>
		  	                        <a href="javascript:void(0)">上市公司</a>          			                               
		                        </dd>
	                        </dl>
	                        <dl>
	                            <dt>行业领域：</dt>
	                            <dd>
	  		                        <a href="javascript:void(0)">培训</a>
		  		                    <a href="javascript:void(0)">互联网</a>
					  		        <a href="javascript:void(0)">休闲</a>
					  		        <a href="javascript:void(0)">电路</a>
					  		        <a href="javascript:void(0)">促销</a>
					  		        <a href="javascript:void(0)">脚本开发</a>
					  		        <a href="javascript:void(0)">酒店</a>
					  		        <a href="javascript:void(0)">电子</a>
					  		        <a href="javascript:void(0)">旅游</a>
					  		        <a href="javascript:void(0)">物业</a>
					  		        <a href="javascript:void(0)">兼职</a>
					  		        <a href="javascript:void(0)">系统工程师</a>
					  		        <a href="javascript:void(0)">家电维修</a>
					  		        <a href="javascript:void(0)">班车司机</a>
					  		        <a href="javascript:void(0)">销售</a>
					  		        <a href="javascript:void(0)">行政</a>
					  		        <a href="javascript:void(0)">财务</a>
					  		        <a href="javascript:void(0)">工程</a>
					  		        <a href="javascript:void(0)">服装</a>
					  		        <a href="javascript:void(0)">UI设计</a>
					  		        <a href="javascript:void(0)">软件</a>
					  		        <a href="javascript:void(0)">分销</a>
					  		        <a href="javascript:void(0)">商务助理</a>
					  		        <a href="javascript:void(0)">翻译</a>
					  		        <a href="javascript:void(0)">其他</a>
		     					 </dd>
							</dl>
	 
				        </dd>
				    </dl>
				    
	            <div id="search_box">  <!-- 搜索框开始 -->
					<form id="searchForm" name="searchForm" action="list.jsp" method="get">
				        <ul id="searchType">
				        	<li data-searchtype="4" class="type_selected">公司</li>
				        </ul>
			        <div class="searchtype_arrow"></div>
			        <input type="text" id="search_input"    tabindex="1"     width="10%"    placeholder="请输入公司名称，如：联想"   v-model="search" />
			        </form>
		       </div>    <!-- 搜索结束 -->
		       
		       
	   	    	<ul class="hc_list reset">   <!-- 公司列表开始 -->
		      	  <li     v-for="(item,index) in  companyList" :style="{'yes-right-border':index==0||index==3||index==6||index==9||index==12}">
			      	 <a href="#" target="_blank">
						<h3 title="CCIC">{{item.companyshortname}}</h3>
						<div class="comLogo">
						
						<img :src="item.companylogo" width="190" height="190" alt="CCIC" />
						<ul>
							<li>{{item.industry}}</li>
							<li>{{item.city}}，{{item.development}}</li>
						</ul>
						</div>
					 </a>
						<a href="#" target="_blank"> {{item.companysize}}</a>
						<a href="#" target="_blank"> {{item.productname}}</a>
						<a href="#" target="_blank"> {{item.companywebsite}}</a>
						<ul class="reset ctags">
						  <li>{{item.companytag}}</li>
						  <li>{{item.ceoname}}</li>
						  <li>{{item.companyname}}</li>
						  <li>{{item.companyprofile}}</li>
						</ul>
			      </li>
				   	 
				        		 
				  </ul>  <!-- 公司列表结束 -->
				  
		        <!--分页 -->
				<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
					<zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
				</div>
				<!-- 分页结束 -->
	  </form>
</div>	
<div class="content_r">
	<div class="subscribe_side">
	</div> 
    <div class="greybg qrcode mt20">
    	<img src="style/images/companylist_qr.png" width="242" height="242" alt="拉勾微信公众号二维码" />
        <span class="c7">扫描拉勾二维码，微信轻松搜工作</span>
    </div>
   	<!-- <a href="h/speed/speed3.jsp" target="_blank" class="adSpeed"></a> -->
    <a href="#"   class="eventAd">
   		<img src="style/images/subject280.jpg" width="280" height="135" />
   	</a>
   	<a href="#"  class="eventAd">
   		<img src="style/images/rising280.png" width="280" height="135" />
   	</a>
</div>
       	</div>
   	
   	<input type="hidden" value="" name="userid" id="userid" />
       	
			<div class="clear"></div>
			<input type="hidden" id="resubmitToken" value="" />
	    	<a id="backtop" title="回到顶部" rel="nofollow"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a href="h/about.jsp" target="_blank" rel="nofollow">联系我们</a>
		    <a href="h/af/zhaopin.jsp" target="_blank">互联网公司导航</a>
		    <a href="http://e.weibo.com/lagou720" target="_blank" rel="nofollow">微博</a>
		    <a class="footer_qr" href="javascript:void(0)" rel="nofollow">微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a target="_blank" href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action">京ICP备14023790号-2</a></div>
		</div>
	</div>

<script type="text/javascript" src="style/js/core.min.js"></script>
<script type="text/javascript" src="style/js/popup.min.js"></script>

<!--  -->
<script type="text/javascript">

    var companyListvue=new Vue({
        el:'#body',
        data:{
    	 ident:-1,
         email:"",
         companyList:[],
         page:1,
         pageSize:15,
         total:100,
         maxPage:9,
         city:'',
         fz:'',
         hy:'',
         search:''
         
        },
        methods:{
			 pageHandler:function(page){
			           this.page=page;
			           var params={"page":page,"row":this.pageSize,"city":this.city,'fz':this.fz,'hy':this.hy,'search':this.search};
			           this.$http.post("getCompanyList.do",params,{emulateJSON:true}).then(
			              function(res){
			                this.companyList=res.data.list;
			                this.total=res.data.total;
			                this.maxPage=res.data.pages;
			              },
			              function(res){
			                  console.log(res);
			              } );
			  }
          },
          
watch:{
            city:function(val,oldval){
                 this.pageHandler(1);
                console.log(this.city+this.fz+this.hy+this.search)
            },   
            fz:function(val,oldval){
                this.pageHandler(1);
               console.log(this.city+this.fz+this.hy+this.search)
            },
            hy:function(val,oldval){
                this.pageHandler(1);
                console.log(this.city+this.fz+this.hy+this.search)
            },
            search:function(val,oldval){
                this.pageHandler(1);
                console.log(this.city+this.fz+this.hy+this.search)
            }
},
created:function(){
	//created代表当页面加载完成，立刻执行后面的方法
	//发生Ajax请求
	this.ident=${sessionScope.ident}
	console.log(this.ident+"ident");
	//解码 
	this.search= decodeURI(getQueryString("companyName"));  //接受其他页面的参数
	if(this.search=="null") {this.search=""}
	console.log(this.search+"search");
	this.pageHandler(1);
}// end create
});//end vue

</script>
</body>

<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script src="style/js/ajaxfileupload.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/additional-methods.js"></script>
<script type="text/javascript" src="style/js/company_list.min.js"></script>

</html>