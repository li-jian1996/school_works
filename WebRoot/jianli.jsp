<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
  
 
<script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script>
<style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>我的简历-求职招聘网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="求职招聘网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在求职招聘网">
<meta name="keywords" content="求职招聘,求职招聘网,求职招聘招聘,求职招聘, 求职招聘网 ,互联网招聘,求职招聘互联网招聘, 移动互联网招聘, 
垂直互联网招聘, 微信招聘, 微博招聘, 求职招聘官网, 求职招聘百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, 
LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">
<script src="style/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="style/js/util.js"></script>
<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link href="h/images/favicon.ico" rel="Shortcut Icon">
<link href="style/css/style.css" type="text/css" rel="stylesheet">
<link href="style/css/external.min.css" type="text/css" rel="stylesheet">
<link href="style/css/popup.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
 </head>
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="h/">
    			<img width="229" height="43" alt="求职招聘招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index.jsp">首页</a></li>
    			<li><a href="companylist.jsp">公司</a></li>
    			<li v-if="ident == 0" class="current"><a href="jianli.jsp" rel="nofollow">我的简历</a></li>
    			<li v-else-if="ident == 1" class="current"><a href="mycompany.jsp" rel="nofollow">公司信息</a></li>
    			
	    		<li v-if="ident == 1"  ><a href="create.jsp" rel="nofollow">发布职位</a></li>
	    		<li v-else-if="ident == 0"  ><a href="delivery.jsp" rel="nofollow">投递箱</a></li>
	    						    		</ul>
        	  <dl class="collapsible_menu" v-if="ident==0">
            	<dt>
           			<span> ${sessionScope.person.email}&nbsp;</span> 
            		<span class="red dn" id="noticeDot-0"></span>
            		<i></i>
            	</dt>
                      <dd><a rel="nofollow" href="jianli.jsp">我的简历</a></dd>
                	  <dd><a href="delivery.jsp">我投递的职位</a></dd>
                	   
                      <dd><a href="accountBind.jsp">帐号设置</a></dd>
                      <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
              </dl>
              <div class="dn" id="noticeTip">
            	<span class="bot"></span>
				<span class="top"></span>
				<a target="_blank" href="delivery.jsp"><strong>0</strong>条新投递反馈</a>
				<a class="closeNT" href="javascript:;"></a>
              </div>
      </div><!-- end #warpp -->
    </div><!-- end #header -->
    <div id="container">
        
  		<div class="clearfix">
            <div class="content_l">
            	<div class="profile_box" id="basicInfo">
 
            		<h2>基本信息</h2>
            		<span class="c_edit"></span>
            		<div class="basicShow">
            			 <span>{{person.username}}|  {{person.sex}} | 
            			  <span v-if="person.education==0">大专</span> 
            			  <span v-if="person.education==1">本科</span> 
            			  <span v-if="person.education==2">硕士</span> 
            			  <span v-if="person.education==3">博士</span> 
            			  <span v-if="person.education==4">其他</span> 
            			  |  
            			  <span v-if="person.aftereducation==0">应届毕业生</span>
            			  <span v-else>{{person.aftereducation}}年工作经历</span>
            			  </span> 
            			  <br>
            			   {{person.tel}} | {{person.email}}<br>
            			</span>
            			<div class="m_portrait">
	                    	<div></div>
	                    	<img width="120" height="120" alt="jason" :src="person.headimage">
	                    </div>
            		</div><!--end .basicShow-->

            		<div class="basicEdit dn">
            			<form id="profileForm" class="form-horizontal" enctype="multipart/form-data">
						  <table>
						    <tbody><tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td>
						        <input type="text" placeholder="姓名"  id="username" name="username"  v-model="person.username" >
						      </td>
						      <td valign="top"></td> 
						      <td>
						          <ul class="  clearfix reset">
						            <li  >
						              	<input type="text"   v-model="person.sex"    id="sex" name="sex" > 
						            </li>
						             
						          </ul>  
						      </td>
						    </tr>
						    <tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td>
						      	 <select class="profile_select_190 profile_select_normal"   id="education" name="education" v-model="person.education" style=" appearance:none;-moz-appearance:none;-webkit-appearance:none;-ms-appearance:none;">
									  <option value ="0">大专</option>
									  <option value ="1">本科</option>
									  <option value="2">硕士</option>
									  <option value="3">博士</option>
									  <option value="4">其他</option>
								 </select>
							 
						      </td>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td>
						         <select class="profile_select_190 profile_select_normal"  id="aftereducation" name="aftereducation" v-model="person.aftereducation" style=" appearance:none;-moz-appearance:none;-webkit-appearance:none;-ms-appearance:none;">
									  <option value ="0">应届毕业生</option>
									  <option v-for="(item,index) in 20"  :value ="item">{{item}}年</option>
								 </select>
						      </td>
						    </tr>
						    <tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td colspan="3">
						          <input type="text"  placeholder="手机号"       v-model="person.tel"    name="tel">
						      </td>
						   	</tr>
						    
						    <tr>
						      <td valign="top"> </td> 
						      <td colspan="1">
						          <select class="profile_select_190 profile_select_normal"  id="status" name="status" v-model="person.status" style="  appearance:none;-moz-appearance:none;-webkit-appearance:none;-ms-appearance:none;">
									  <option value ="0">我目前已经离职,可快速到岗位</option>
									  <option value ="1">我目前正在职，正考虑换个环境</option>
									  <option value="2">我暂时不想找工作</option>
									  <option value="3">我是应届毕业生</option>
								  </select> 
						      </td>
						      <td colspan="3">
						      	  <input type="number" min="15" max="60" v-model="person.age" id="age" name="age">
						      </td>
						    </tr>
						    
						    
						    <tr>
						      <td></td> 
						      <td colspan="3">
						          <input type="button" value="保 存" class="btn_profile_save" onclick="javascript:savePerson();">
						          <a class="btn_profile_cancel" href="javascript:;">取 消</a>
						      </td>
						    </tr>
						    
						    
						
						  <div class="new_portrait">
							  <div class="control-group">
								<label class="control-label" for="fileInput">头像</label>
								<div class="controls">
									<input class="input-file" multiple="multiple" id="imageFile" name="imageFile" type="file" accept="image/*"    />
								</div>
								<div class="controls" id="imgs" >
								<img  :src="person.headimage" width=150px  height=150px>
								</div>
							</div>	
							</div><!--end .new_portrait-->
							
						  </tbody></table>
							  
						</form><!--end #profileForm-->
						
            		</div><!--end .basicEdit-->
            		 
            		<input type="hidden" id="currentStateVal" :value="status">
            		 
            		 
            	</div><!--end #basicInfo-->

            	<div class="profile_box" id="expectJob">
            		<h2>期望工作</h2>
            		            		<span class="c_edit dn"></span>
            		<div class="expectShow dn">
            		            			<span></span>
            		</div><!--end .expectShow-->
            		<div class="expectEdit dn">
            			<form id="expectForm">
	            			<table>
	            				<tbody><tr>
	            					<td>
	            						<input type="hidden" id="expectCity"   v-model="resumeinformation.city" >
	            							<input type="button"  :value="resumeinformation.city"  id="select_expectCity" class="profile_select_287 profile_select_normal"   >
												<div class="boxUpDown boxUpDown_596 dn" id="box_expectCity" style="display: none;">
								          				<dl>
								        			<dt>热门城市</dt>
								        			<dd>
									        			<span>北京</span>
									        			<span>上海</span>
									        			<span>广州</span>
									        			<span>深圳</span>
									        			<span>成都</span>
									        			<span>杭州</span>
									        		</dd>
								        	  	</dl>
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
								        				  </div>  
	            					</td>
	            					<td>
	            						 <select class="profile_select_190 profile_select_normal"    v-model="resumeinformation.worktype" style=" appearance:none;-moz-appearance:none;-webkit-appearance:none;-ms-appearance:none;">
											  <option value ="0">全职</option>
											  <option value ="1">兼职</option>
											  <option value ="2">实习</option>
											  
										 </select> 
	            					</td>
	            				</tr>
	            				<tr>
	            					<td>
							        	<input type="text" placeholder="期望职位，如：产品经理"    v-model="resumeinformation.expectedposition" name="expectPosition" id="expectPosition">
									</td>
	            					<td>
	            						<select class="profile_select_190 profile_select_normal"    v-model="resumeinformation.expectedsalary" style=" appearance:none;-moz-appearance:none;-webkit-appearance:none;-ms-appearance:none;">
											  <option value ="2k以下">2k以下</option>
											  <option value ="2k-5k">2k-5k</option>
											  <option value ="5k-10k">5k-10k</option>
											  <option value ="10k-15k">10k-15k</option>
											  <option value ="15k-20k">15k-20k</option>
											  <option value ="25k-50k">25k-50k</option>
										 </select>   
	            					</td>
	            				</tr>
	            				<tr>
	            					<td colspan="2">
										<input type="button" value="保 存"  @click="saveResumeinformation()" class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
            			</form><!--end #expectForm-->
            		</div><!--end .expectEdit-->
            		      <div class="expectAdd pAdd">
            		         {{resumeinformation.city}} |      
            		         <a v-if="resumeinformation.worktype==0">全职</a> 
            		         <a v-if="resumeinformation.worktype==1">兼职</a>
            		         <a v-if="resumeinformation.worktype==2">实习</a>
            		         
            		         <br>
						   {{resumeinformation.expectedposition}} | {{resumeinformation.expectedsalary}}
						<span>添加期望工作</span>
            		</div><!--end .expectAdd-->
            		
            		<input type="hidden" id="expectJobVal" value="">
            		<input type="hidden" id="expectCityVal" value="">
            		<input type="hidden" id="typeVal" value="">
            		<input type="hidden" id="expectPositionVal" value="">
            		<input type="hidden" id="expectSalaryVal" value="">
            	</div><!--end #expectJob-->
            		
            	<div class="profile_box" id="workExperience">
            		<h2>工作经历  <span> （投递简历时必填）</span></h2>
            		            		<span class="c_add dn"></span>
            		<div class="experienceShow dn">
            		            			<form class="experienceForm borderBtm dn">
	            			<table>
	            				<tbody><tr>
							      	<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							        	<input type="text" placeholder="公司名称" name="companyName"   class="companyName">
							      	</td>
							      	<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							          	<input type="text" placeholder="职位名称，如：产品经理" name="positionName" class="positionName">
							      	</td>
							    </tr>
	            				<tr>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
		            					<div class="fl">
		            						<input type="hidden" class="companyYearStart" value="" name="companyYearStart"   >
								        	<input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_companyYearStart">
											<div class="box_companyYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										<div class="fl">
									        <input type="hidden" class="companyMonthStart" value="" name="companyMonthStart"   >
								        	<input type="button" value="开始月份" class="profile_select_139 profile_select_normal select_companyMonthStart">
											<div style="display: none;" class="box_companyMonthStart boxUpDown boxUpDown_139 dn">
									            <ul>
									        		<li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li>
									        		<li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
									        	</ul>
									        </div>
									    </div>
									    <div class="clear"></div>
	            					</td>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
		            					<div class="fl">
		            						<input type="hidden" class="companyYearEnd" value="" name="companyYearEnd"  >
								        	<input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_companyYearEnd">
											<div class="box_companyYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									            	<li>至今</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										<div class="fl">
									        <input type="hidden" class="companyMonthEnd" value="" name="companyMonthEnd">
								        	<input type="button" value="结束月份" class="profile_select_139 profile_select_normal select_companyMonthEnd">
											<div style="display: none;" class="box_companyMonthEnd boxUpDown boxUpDown_139 dn">
									            <ul>
									        		<li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
									        	</ul>
									        </div>
								        </div>
								        <div class="clear"></div>
	            					</td>
	            				</tr>
	            				<tr>
	            					<td></td>
	            					<td colspan="3">
										<input type="button"  value="保 存" class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
	            			<input type="hidden" class="expId" value="">
            			</form><!--end .experienceForm-->
            			
            			<ul class="wlist clearfix">
            				            				            			</ul>
            		</div><!--end .experienceShow-->
            		<div class="experienceEdit dn">
            			<form class="experienceForm">
	            			<table>
	            				<tbody><tr>
							      	<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							        	<input type="text" placeholder="公司名称" name="companyName"   v-model="workexperience.companyname">
							      	</td>
							      	<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							          	<input type="text" placeholder="职位名称，如：产品经理" name="positionName" v-model="workexperience.positionname" >
							      	</td>
							    </tr>
	            				<tr>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
		            					<div class="fl">
		            						<input type="hidden" class="companyYearStart" value="" name="companyYearStart" id="workBeginYear">
								        	<input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_companyYearStart"    >
											<div class="box_companyYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									        		<li>2018</li>
									            	<li>2017</li>
									        		<li>2016</li>
									                <li>2015</li>
									            	<li>2015</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										 
									    <div class="clear"></div>
	            					</td>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
		            					<div class="fl">
		            						<input type="hidden" class="companyYearEnd" value="" name="companyYearEnd" id="workEndYear">
								        	<input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_companyYearEnd"  >
											<div class="box_companyYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									            	<li>2018</li>
									            	<li>2017</li>
									        		<li>2016</li>
									                <li>2015</li>
									            	<li>2015</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										 
								        <div class="clear"></div>
	            					</td>
	            				</tr>
	            				<tr>
	            					<td></td>
	            					<td colspan="3">
										<input type="button" value="保 存" @click="saveWorkexperience" class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
	            			<input type="hidden" class="expId" value="">
            			</form><!--end .experienceForm-->
            		</div><!--end .experienceEdit-->
            		    <div class="experienceAdd pAdd">
            		      {{workexperience.companyname}}&nbsp;&nbsp;&nbsp;&nbsp;{{workexperience.positionname}}
            			  <br>
            			   {{workexperience.beginyear}} | {{workexperience.endyear}}
            			   <br>
						<span>修改工作经历</span>
            		</div><!--end .experienceAdd-->
            	</div><!--end #workExperience-->

            	<div class="profile_box" id="projectExperience">
            		<h2>项目经验</h2>
            		            		<span class="c_add dn"></span>
            		<div class="projectShow dn">
            		            			<ul class="plist clearfix">
	            			            			</ul>
            		</div><!--end .projectShow-->
            		<div class="projectEdit dn">
            			<form class="projectForm">
	            			<table>
	            				<tbody><tr>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							        	<input type="text" placeholder="项目名称" name="projectName" v-model="projectexperience.projectname" >
							      	</td>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							          	<input type="text" placeholder="担任职务，如：产品负责人" name="thePost" v-model="projectexperience.post"  >
							      	</td>
							    </tr>
	            				<tr>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
		            					<div class="fl">
		            						<input type="hidden" class="projectYearStart" value="" name="projectYearStart" id="projectBeginYear">
								        	<input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_projectYearStart">
											<div class="box_projectYearStart  boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									        		<li>2018</li>
									            	<li>2017</li>
									        		<li>2016</li>
									                <li>2015</li>
									            	<li>2015</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										 
								        <div class="clear"></div>
	            					</td>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
	            						<div class="fl">
		            						<input type="hidden" class="projectYearEnd" value="" name="projectYearEnd" id="projectEndYear">
								        	<input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_projectYearEnd">
											<div class="box_projectYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									            	<li>2018</li>
									            	<li>2017</li>
									        		<li>2016</li>
									                <li>2015</li>
									            	<li>2015</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										 
								        <div class="clear"></div>
	            					</td>
	            				</tr>
	            			<!--  	<tr>
	            					<td valign="top"></td> 
									<td colspan="3">
										<textarea class="projectDescription s_textarea" name="projectDescription" placeholder="项目描述"></textarea>
										<div class="word_count">你还可以输入 <span>500</span> 字</div>
									</td>
	            				</tr>-->
	            				<!-- <tr>
									<td colspan="2">
										<textarea placeholder="职责描述" name="ResponsDescription" class="ResponsDescription s_textarea"></textarea>
										<div class="word_count">你还可以输入 <span>500</span> 字</div>
									</td>
	            				</tr> -->
	            				<tr>
	            					<td valign="top"></td> 
	            					<td colspan="3">
										<input type="button"  @click="saveProjectexperience()" value="保 存" class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
			            	<input type="hidden" value="" class="projectId">
            			</form><!--end .projectForm-->
            		</div><!--end .projectEdit-->
            		       <div class="projectAdd pAdd">
            		       {{projectexperience.projectname}}&nbsp;&nbsp;&nbsp;&nbsp;{{projectexperience.post}}
            			  <br>
            			   {{projectexperience.beginyear}} | {{projectexperience.endyear}}
            			   <br>
						<span>修改项目经验</span>
            		</div><!--end .projectAdd-->
            	</div><!--end #projectExperience-->

            	<div class="profile_box" id="educationalBackground">
            		<h2>教育背景<span>（投递简历时必填）</span></h2>
            			 
            			<div class="educationalShow dn">
	            			 
            		   </div><!--end .educationalShow-->
            		<div class="educationalEdit dn">
            			<form class="educationalForm">
	            			<table>
	            				<tbody><tr>
							      	<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	<td>
							        	<input type="text"  placeholder="学校名称"  v-model="resumeinformation.schoolname">
							      	</td>
							      	<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
							      	 
							    </tr>
	            				<tr>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
	            						<input type="text" placeholder="专业名称"  v-model= "resumeinformation.professional">
	            					</td>
	            					<td valign="top">
							        	<span class="redstar">*</span>
							      	</td> 
	            					<td>
		            					<div class="fl">
		            						<input type="hidden" class="schoolYearStart" value="" name="schoolYearStart" id="schoolYearbegin">
								        	<input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_schoolYearStart">
											<div class="box_schoolYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									            	<li>2018</li>
									            	<li>2017</li>
									            	<li>2016</li>
									            	<li>2015</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
										</div>
										<div class="fl">
		            						<input type="hidden" class="schoolYearEnd" value="" name="schoolYearEnd" id="schoolYearend">
								        	<input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_schoolYearEnd">
											<div class="box_schoolYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
									            <ul>
									            	<li>2018</li>
									            	<li>2017</li>
									            	<li>2016</li>
									            	<li>2015</li>
									        		<li>2014</li>
									        		<li>2013</li>
									        		<li>2012</li>
									        		<li>2011</li>
									        		<li>2010</li>
									        		<li>2009</li>
									        		<li>2008</li>
									        		<li>2007</li>
									        		<li>2006</li>
									        		<li>2005</li>
									        		<li>2004</li>
									        		<li>2003</li>
									        		<li>2002</li>
									        		<li>2001</li>
									        		<li>2000</li>
									        		<li>1999</li>
									        		<li>1998</li>
									        		<li>1997</li>
									        		<li>1996</li>
									        		<li>1995</li>
									        		<li>1994</li>
									        		<li>1993</li>
									        		<li>1992</li>
									        		<li>1991</li>
									        		<li>1990</li>
									        		<li>1989</li>
									        		<li>1988</li>
									        		<li>1987</li>
									        		<li>1986</li>
									        		<li>1985</li>
									        		<li>1984</li>
									        		<li>1983</li>
									        		<li>1982</li>
									        		<li>1981</li>
									        		<li>1980</li>
									        		<li>1979</li>
									        		<li>1978</li>
									        		<li>1977</li>
									        		<li>1976</li>
									        		<li>1975</li>
									        		<li>1974</li>
									        		<li>1973</li>
									        		<li>1972</li>
									        		<li>1971</li>
									        		<li>1970</li>
									        											        	</ul>
									        </div>
	            						</div>
	            						<div class="clear"></div>
	            					</td>
	            				</tr>
	            				<tr>
	            					<td></td>
	            					<td colspan="3">
										<input type="button" value="保 存" @click="saveWorkexperience()" class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
	            			<input type="hidden" class="eduId" value="">
            			</form><!--end .educationalForm-->
            		</div><!--end .educationalEdit-->
            		    <div class="educationalAdd pAdd">
            		       {{resumeinformation.schoolname}}&nbsp;&nbsp;&nbsp;&nbsp;{{resumeinformation.professional}}
            			  <br>
            			   {{resumeinformation.beginyear}} | {{resumeinformation.endyear}}
            			   <br>
						 
						<span>修改教育经历</span>
            		</div><!--end .educationalAdd-->
            	</div><!--end #educationalBackground-->

            	<div class="profile_box" id="selfDescription">
            		<h2>自我描述</h2>
            		            		<span class="c_edit dn"></span>
            		<div class="descriptionShow dn">
            		            			
            		</div><!--end .descriptionShow-->
            		<div class="descriptionEdit dn">
            			<form class="descriptionForm">
	            			<table>
	            				<tbody><tr>
									<td colspan="2">
										<textarea class=" s_textarea" placeholder="" v-model="resumeinformation.selfdescription">
										</textarea>
										<div class="word_count">你还可以输入 <span>500</span> 字</div>
									</td>
	            				</tr>
	            				<tr>
	            					<td colspan="2">
										<input type="button" value="保 存" @click="saveResumeinformation"  class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
            			</form><!--end .descriptionForm-->
            		</div><!--end .descriptionEdit-->
            		   <div class="descriptionAdd pAdd">
            			   {{resumeinformation.selfdescription}}
            			   <br>
						 <span>修改自我描述</span>
            		</div><!--end .descriptionAdd-->
            	</div><!--end #selfDescription-->

            	<div class="profile_box" id="worksShow">
            		<h2>作品展示</h2>
            		            		<span class="c_add dn"></span>
            		<div class="workShow dn">
            		            			<ul class="slist clearfix">
            				            			</ul>
            		</div><!--end .workShow-->
            		<div class="workEdit dn">
            			<form class="workForm">
	            			<table>
	            				<tbody><tr>
							      	<td>
							        	<input type="text" placeholder="请输入作品链接" v-model="resumeinformation.workurl">
							      	</td>
							    </tr>
	            				<tr>
									<td>
										<textarea maxlength="100" class="s_textarea" v-model="resumeinformation.explanatorytext" name="workDescription" placeholder="请输入说明文字"></textarea>
										<div class="word_count">你还可以输入 <span>100</span> 字</div>
									</td>
	            				</tr>
	            				<tr>
	            					<td>
										<input type="submit" value="保 存" class="btn_profile_save">
						          		<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            					</td>
	            				</tr>
	            			</tbody></table>
	            			<input type="hidden" class="showId" value="">
            			</form><!--end .workForm-->
            		</div><!--end .workEdit-->
            		     <div class="workAdd pAdd">
            		       {{resumeinformation.workurl}}<br>
						   {{resumeinformation.explanatorytext}}
						<span>修改作品展示</span>
            		</div><!--end .workAdd-->
            	</div><!--end #worksShow-->
				<input type="hidden" id="resumeId" value="268472">
            </div><!--end .content_l-->
            <div class="content_r">
            	<div class="mycenterR" id="myInfo">
            		<h2>我的信息</h2>
            		<a target="_blank" href="collections.jsp">我收藏的职位</a>
            		<br>
            		            		            		<a target="_blank" href="subscribe.jsp">我订阅的职位</a>
            	</div><!--end #myInfo-->

				<div class="mycenterR" id="myResume">
            		<h2>我的附件简历 
            			            			<a title="上传附件简历" href="#uploadFile" class="inline cboxElement">上传简历</a>
            			            		</h2>
            		<div class="resumeUploadDiv">
	            			            		暂无附件简历
	            		            		</div>
            	</div><!--end #myResume-->

            	<div class="mycenterR" id="resumeSet">
            		<h2>投递简历设置  <span>修改设置</span></h2>
            		<!-- -1 (0=附件， 1=在线， 其他=未设置) -->
            		            		            			<div class="noSet set0 dn">默认使用<span>附件简历</span>进行投递</div>
            			<div class="noSet set1 dn">默认使用<span>在线简历</span>进行投递</div>
						<div class="noSet">暂未设置默认投递简历</div>
            		            		<input type="hidden" class="defaultResume" value="-1">
            		<form class="dn" id="resumeSetForm">
	            		<label><input type="radio" value="1" class="resume1" name="resume">默认使用<span>在线简历</span>进行投递</label>
	            		<label><input type="radio" value="0" class="resume0" name="resume">默认使用<span>附件简历</span>进行投递</label>
	            		<span class="setTip error"></span>
	            		<div class="resumeTip">设置后投递简历时将不再提醒</div>
	            		<input type="submit" value="保 存" class="btn_profile_save">
						<a class="btn_profile_cancel" href="javascript:;">取 消</a>
	            	</form>
            	</div><!--end #resumeSet-->
				
				<div class="mycenterR" id="myShare">
            		<h2>当前每日投递量：10个</h2>
            		<a target="_blank" href="h/share/invite.jsp">邀请好友，提升投递量</a>
            	</div><!--end #myShare-->
            	
								
				<div class="greybg qrcode mt20">
                	<img width="242" height="242" alt="求职招聘微信公众号二维码" src="style/images/qr_resume.png">
                    <span class="c7">微信扫一扫，轻松找工作</span>
                </div>
            </div><!--end .content_r-->
        </div>
        
      <input type="hidden" id="userid" name="userid" value="314873">

<!-------------------------------------弹窗lightbox ----------------------------------------->
<div style="display:none;">
	<!-- 上传简历 -->
	<div class="popup" id="uploadFile">
	    <table width="100%">
	    	<tbody><tr>
	        	<td align="center">
	                <form>
	                    <a class="btn_addPic" href="javascript:void(0);">
	                    	<span>选择上传文件</span>
	                        <input type="file" onchange="file_check(this,'h/nearBy/updateMyResume.json','resumeUpload')"
	                         class="filePrew" id="resumeUpload" name="newResume" size="3" title="支持word、pdf、ppt、txt、wps格式文件，大小不超过10M" tabindex="3">
	                    </a>
	                </form>
	            </td>
	        </tr>
	    	<tr>
	        	<td align="left">支持word、pdf、ppt、txt、wps格式文件<br>文件大小需小于10M</td>
	        </tr>
	        <tr>
	        	<td align="left" style="color:#dd4a38; padding-top:10px;">注：若从其它网站下载的word简历，请将文件另存为.docx格式后上传</td>
	        </tr>
	    	<tr>
	        	<td align="center"><img width="55" height="16" alt="loading" style="visibility: hidden;" id="loadingImg" src="style/images/loading.gif"></td>
	        </tr>
	    </tbody></table>
	</div><!--/#uploadFile-->
	
	<!-- 简历上传成功 -->
	<div class="popup" id="uploadFileSuccess">
     	<h4>简历上传成功！</h4>
         <table width="100%">
             <tbody><tr>
                 <td align="center"><p>你可以将简历投给你中意的公司了。</p></td>
             </tr>
         	<tr>
             	<td align="center"><a class="btn_s" href="javascript:;">确&nbsp;定</a></td>
             </tr>
         </tbody></table>
     </div><!--/#uploadFileSuccess-->
     
	<!-- 没有简历请上传 -->
    <div class="popup" id="deliverResumesNo">
        <table width="100%">
            <tbody><tr>
                <td align="center"><p class="font_16">你在求职招聘还没有简历，请先上传一份</p></td>
            </tr>
        	<tr>
            	<td align="center">
                    <form>
                        <a class="btn_addPic" href="javascript:void(0);">
                        	<span>选择上传文件</span>
                        	<input type="file" onchange="file_check(this,'h/nearBy/updateMyResume.json','resumeUpload1')"
                        	 class="filePrew" id="resumeUpload1" name="newResume" size="3" title="支持word、pdf、ppt、txt、wps格式文件，大小不超过10M">
                        </a>
                    </form>
                </td>
            </tr>
        	<tr>
            	<td align="center">支持word、pdf、ppt、txt、wps格式文件，大小不超过10M</td>
            </tr>
        </tbody></table>
    </div><!--/#deliverResumesNo-->
    
    <!-- 上传附件简历操作说明-重新上传 -->
    <div class="popup" id="fileResumeUpload">
        <table width="100%">
            <tbody><tr>
                <td>
                	<div class="f18 mb10">请上传标准格式的word简历</div>
                </td>
            </tr>
            <tr>
                <td>
                	<div class="f16">
                		操作说明：<br>
                		打开需要上传的文件 - 点击文件另存为 - 选择.docx - 保存
                	</div>
                </td>
            </tr>
        	<tr>
            	<td align="center">
            		<a title="上传附件简历" href="#uploadFile" class="inline btn cboxElement">重新上传</a>
            	</td>
            </tr>
        </tbody></table>
    </div><!--/#fileResumeUpload-->
    
    <!-- 上传附件简历操作说明-重新上传 -->
    <div class="popup" id="fileResumeUploadSize">
        <table width="100%">
            <tbody><tr>
                <td>
                	<div class="f18 mb10">上传文件大小超出限制</div>
                </td>
            </tr>
            <tr>
                <td>
                	<div class="f16">
                		提示：<br>
                		单个附件不能超过10M，请重新选择附件简历！
                	</div>
                </td>
            </tr>
        	<tr>
            	<td align="center">
            		<a title="上传附件简历" href="#uploadFile" class="inline btn cboxElement">重新上传</a>
            	</td>
            </tr>
        </tbody></table>
    </div><!--/#deliverResumeConfirm-->
    
</div>
<!------------------------------------- end ----------------------------------------->  


<!-- <div id="profileOverlay"></div> -->
<div class="" id="qr_cloud_resume" style="display: none;">
	<div class="cloud">
		<img width="134" height="134" src="">
		<a class="close" href="javascript:;"></a>
	</div>
</div>



			<div class="clear"></div>
			<input type="hidden" value="97fd449bcb294153a671f8fe6f4ba655" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop" style="display: none;"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="h/about.jsp">联系我们</a>
		    <a target="_blank" href="h/af/zhaopin.jsp">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">求职招聘微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">求职招聘微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" 
			target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>



<!--  -->
<script type="text/javascript">

    var jianlivue=new Vue({
        el:'#body',
        data:{
    	 ident:-1,
         email:"",
         status:'',
         isChangeImag:0,
         person:{
            personid:0,
         	username:'',
			sex:'',
		    age:0,
		    education:0,
		    aftereducation:0,
		    tel:'',
		    email:'',
		    pwd:'',
		    headimage:'',
		    status:'',  //目前状态
		    registeredtime:'',
		  	state:0
         },
         resumeinformation:{
            resumeid:0,
            personid:0,
            city:"黄石 ",
            worktype:1,
            expectedposition:"产品经理",
            expectedsalary:"5k-10k",
            schoolname:"湖北理工学院",
            professional:"计算机科学与技术",
            beginyear:"2014",
            endyear:"2016",
            selfdescription:"自我描述啦啦啦啦啦",
            workurl:"workurl",
            explanatorytext:"作品描述",
            resumeattachments:""
         },
         projectexperience:{
            projectexperienceid:0,
      		personid:0,
     		projectname:"",
    		post:"",
     		beginyear:0,
     		endyear:0 
         },
         workexperience:{
            workexperienceid:0,
     		personid:0,
      		companyname:"",
     		positionname:"",
		    beginyear:0,
		    endyear:0 
         }
         
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
           saveResumeinformation:function(){
           	 
           	 if($("#expectCity").get(0).value!=''){this.resumeinformation.city=$("#expectCity").get(0).value ;}
           	 if($("#schoolYearbegin").get(0).value!=''){this.resumeinformation.beginyear=$("#schoolYearbegin").get(0).value ;}
 			 if($("#schoolYearend").get(0).value!=''){this.resumeinformation.endyear=$("#schoolYearend").get(0).value ;}

             console.log(this.resumeinformation.city+this.resumeinformation.worktype+
             this.resumeinformation.expectedposition+this.resumeinformation.expectedsalary)
             console.log(this.resumeinformation.schoolname+this.resumeinformation.professional+
             this.resumeinformation.beginyear+this.resumeinformation.endyear)
             
             this.$http.post("saveResumeinformation.do",
                	JSON.stringify(this.resumeinformation),
                	{emulateJSON : true}
                   ).then(
        			function(res){
            			 alert("保存信息成功");
        			},
        			function(res){
        			   alert("保存信息失败");
        				 
        			}
        		);
           },        //endsaveResumeinformation
           saveWorkexperience:function(){
           	 
           	 if($("#workEndYear").get(0).value!=''){this.workexperience.endyear=$("#workEndYear").get(0).value ;}
 			 if($("#workBeginYear").get(0).value!=''){this.workexperience.beginyear=$("#workBeginYear").get(0).value ;}

             console.log(this.workexperience.companyname+this.workexperience.positionname+
             			this.workexperience.beginyear+this.workexperience.endyear)
             
             
             this.$http.post("saveWorkExperience.do",
                	JSON.stringify(this.workexperience),
                	{emulateJSON : true}
                   ).then(
        			function(res){
            			 alert("保存信息成功");
        			},
        			function(res){
        			   alert("保存信息失败");
        				 
        			}
        		);
           },        //endsaveResumeinformation
           saveProjectexperience:function(){
           	 
           	 if($("#projectBeginYear").get(0).value!=''){this.projectexperience.beginyear=$("#projectBeginYear").get(0).value ;}
 			 if($("#projectEndYear").get(0).value!=''){this.projectexperience.endyear=$("#projectEndYear").get(0).value ;}

             console.log(this.projectexperience.projectname+this.projectexperience.post+
             this.projectexperience.beginyear+this.projectexperience.endyear)
            
             
             this.$http.post("saveProjectExperience.do",
                	JSON.stringify(this.projectexperience),
                	{emulateJSON : true}
                   ).then(
        			function(res){
            			 alert("保存信息成功");
        			},
        			function(res){
        			   alert("保存信息失败");
        				 
        			}
        		);
           },        //endsaveprojectexperience
       },
         
        created:function(){
        	//created代表当页面加载完成，立刻执行后面的方法
        	//发生Ajax请求
        	//Vue.http.options.content-Type = "application/json";
        	this.ident=(-1),
        	this.ident='${sessionScope.ident}' ;
        	if(this.ident!=0){  window.location.href="login.jsp" };
        	console.log(this.ident+"ident"),
        	this.person.email='${sessionScope.person.email}',
        	this.$http.post("getPersonByEmail.do",   //获得个人信息
                	{'email':this.person.email},{emulateJSON:true}).then(
        			function(res){
            			this.person=res.data;
            			
            			if(this.person.status==0){this.status="我目前已离职,可快速到岗"}
            			if(this.person.status==1){this.status="我目前正在职,正考虑换个新环境"}
            			if(this.person.status==2){this.status="我暂时不想找工作"}
            			if(this.person.status==3){this.status="我是应届毕业生"}
            			this.$http.post("getresumeinformation.do",   //获得个人简历信息
		                	{'personid':this.person.personid},{emulateJSON:true}).then(
		        			function(res){
		            			this.resumeinformation=res.data;
		            			 
		        			},
		        			function(res){
		        				console.log(res);
		                    }
		        	   );
		        	   this.$http.post("getProjectExperience.do",   //获得个人项目信息
		                	{'personid':this.person.personid},{emulateJSON:true}).then(
		        			function(res){
		            			this.projectexperience=res.data;
		            			 
		        			},
		        			function(res){
		        				console.log(res);
		                    }
		        	   );
		        	   this.$http.post("getWorkExperience.do",   //获得个人工作信息
		                	{'personid':this.person.personid},{emulateJSON:true}).then(
		        			function(res){
		            			this.workexperience=res.data;
		            			 
		        			},
		        			function(res){
		        				console.log(res);
		                    }
		        	   );
			        	   
        			},
        			function(res){
        				console.log(res);
                    }
        	);
        	
        	
        	
        }  //end created
    });

</script>
 
<script type="text/javascript">
$(function(){
	$('#noticeDot-1').hide();
	$('#noticeTip a.closeNT').click(function(){
		$(this).parent().hide();
	});
});

$("#imageFile").change(function(){
		var files=$("#imageFile").get(0).files;//获取选择文件的图片文件内容
		var imgs=$("#imgs");
		jianlivue.isChangeImag=1;
		imgs.empty();//先将原先选择的图片内容清空
		for(var i=0;i<1;i++){
			if(files[i]){
				//读取文件内容
				var reader=new FileReader();
				reader.readAsDataURL(files[i]);
				//读取完毕之后，增加表单img标签，并设置src属性
				reader.onload=function(e){
					var img=$("<img   width=150px  height=150px  name='headimage'  id='headimage' src='"+e.target.result+"'><img>");
					imgs.append(img);
				};
			}
		}
		files.empty();
});

function savePerson(){
    	
    	var params=new FormData($("#profileForm")[0]);
    	params.set("personid",jianlivue.person.personid);
    	
    	if(jianlivue.isChangeImag==0)
    	{params.set("headimage",'未选择');}
    	else {params.set("headimage",'已选择');}
    	 
    	 
    	$.ajax({
    		url:"savePerson.do",
    	    type:"post",
    	  	data:params,
    	   	async:false,
    	   	cache:false,
    	   	contentType:false,
    	   	processData:false,
    	   	success:function(data){
    	   		alert("保存信息成功");
    	   },
    	   error:function(){
    	   		alert("保存信息失败");
    	   }
    	
    	});
}
var index = Math.floor(Math.random() * 2);
var ipArray = new Array('42.62.79.226','42.62.79.227');
var url = "ws://" + ipArray[index] + ":18080/wsServlet?code=314873";
var CallCenter = {
		init:function(url){
			var _websocket =0;
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

<div id="cboxOverlay" style="display: none;"></div>
<div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;">
<div id="cboxWrapper">
	<div>
		<div id="cboxTopLeft" style="float: left;"></div>
		<div id="cboxTopCenter" style="float: left;"></div>
		<div id="cboxTopRight" style="float: left;"></div>
	</div>
	<div style="clear: left;">
		<div id="cboxMiddleLeft" style="float: left;"></div>
		<div id="cboxContent" style="float: left;">
			<div id="cboxTitle" style="float: left;"></div>
			<div id="cboxCurrent" style="float: left;"></div>
			<button type="button" id="cboxPrevious"></button>
			<button type="button" id="cboxNext"></button>
			<button id="cboxSlideshow"></button>
			<div id="cboxLoadingOverlay" style="float: left;"></div>
			<div id="cboxLoadingGraphic" style="float: left;"></div>
		</div>
		<div id="cboxMiddleRight" style="float: left;"></div>
	</div>
	<div style="clear: left;">
		<div id="cboxBottomLeft" style="float: left;"></div>
		<div id="cboxBottomCenter" style="float: left;"></div>
		<div id="cboxBottomRight" style="float: left;"></div>
	</div>
</div>
<div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div>
</div>


</body>
<script src="style/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="style/js/jquery.lib.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/ajaxfileupload.js"></script>
<script src="style/js/additional-methods.js" type="text/javascript"></script>
<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>
<script src="style/js/Chart.min.js" type="text/javascript"></script>
<script src="style/js/profile.min.js" type="text/javascript"></script>
</html>