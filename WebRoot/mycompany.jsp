<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
</script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>  求职招聘网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="平潭协创进出口贸易有限公司 福建平潭协创进出口贸易有限公司 上海 移动互联网 天使轮 150-500人 测试的发打发打发大范德萨发">
<meta name="keywords" content="平潭协创进出口贸易有限公司 福建平潭协创进出口贸易有限公司 上海 移动互联网 天使轮 150-500人 测试的发打发打发大范德萨发">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">http://www.lagou.com</div> -->
<script type="text/javascript">
var ctx = "http://www.lagou.com";
var youdao_conv_id=1;
console.log(1);
</script>
<link href="http://www.lagou.com/images/favicon.ico" rel="Shortcut Icon">
<link href="style/css/style.css" type="text/css" rel="stylesheet">
<link href="style/css/external.min.css" type="text/css" rel="stylesheet">
<link href="style/css/popup.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="style/js/vue.js"></script>
<script type="text/javascript" src="style/js/vue-resource.js"></script>
<script src="style/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="style/js/additional-methods.js" type="text/javascript"></script>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
 

<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="index.jsp">
    			<img width="229" height="43" alt="求职招聘招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index.jsp">首页</a></li>
    			<li    ><a href="companylist.jsp" >公司列表</a></li>
    			<li v-if="ident == 0"><a href="jianli.jsp" rel="nofollow">我的简历</a></li>
    			<li v-else-if="ident == 1" class="current"><a href="mycompany.jsp" rel="nofollow">公司信息</a></li>
    			
	    		<li v-if="ident == 1"><a href="create.jsp" rel="nofollow">发布职位</a></li>
	    		<li v-else-if="ident == 0"><a href="jianli.jsp" rel="nofollow">投递箱</a></li>
	    		    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span> ${sessionScope.company.email}&nbsp;</span> 
            		<span class="red dn" id="noticeDot-1"></span>
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
        <!-- <script src="style/js/swfobject_modified.js" type="text/javascript"></script> -->
        <div class="clearfix">
        				
            <div class="content_l">           
	                <div class="c_detail">
	                	<div style="background-color:#fff;" class="c_logo">
		                	<a title="上传公司LOGO" id="logoShow" class="inline cboxElement" href="#logoUploader">
		                		<img width="190" height="190"    :src="company.companylogo">
	                        		                        	
	                        	<span>更换公司图片<br>190px*190px 小于5M</span>
	                        </a>
		                </div>
		                
		                <!--  			                <div class="c_logo" style="background-color:#fff;">
			                	<div id="logoShow">
			                		<img src="style/images/logo_default.png" width="190" height="190" alt="公司logo" />
		                        	<span>更换公司图片<br />190px*190px 小于5M</span>
		                        </div>
		                        <input onchange="img_check(this,'http://www.lagou.com/cd/saveProfileLogo.json',25927,'logo');" type="file" id="logo" name="logo" title="支持jpg、jpeg、gif、png格式，文件小于5M" />
			                     
			                </div>
		                    <span class="error" id="logo_error" style="display:none;"></span>
						     -->
		                
	                    <div class="c_box companyName">
	                    		                   			<h2 title="公司名称">{{company.companyshortname}}</h2>
	                   			                        
	                        	                        	<em class="unvalid"></em>
                        		<span class="va dn" style="display: none;" v-if="company.state==0">求职招聘未认证企业</span>
	                        	<a target="_blank" class="applyC"   v-if="company.state==0">等待认证</a>
	                        	<a target="_blank" class="applyC"   v-if="company.state==1">已认证</a>
	                        	                        <div class="clear"></div>
	                       	
	                       		                   			<h1 title="" class="fullname">{{company.companyname}}</h1>
	                        	                        
	                        <form class="clear editDetail dn" id="editDetailForm" style="display: none;">
	                            <input type="text" placeholder="请输入公司简称" maxlength="15"  v-model="company.companyshortname" name="companyShortName" id="companyShortName" class="valid">
	                            <input type="text" placeholder="一句话描述公司优势，核心价值，限50字" maxlength="50"  v-model="company.companyprofile" name="companyFeatures" id="companyFeatures" class="valid"><span for="companyFeatures" generated="true" class="error" style="display: none;">请输入5-50字的一句话介绍</span>
	                            <input type="hidden" value="25927" id="companyId" name="companyId">
	                          <!--  <input type="submit" value="保存" id="saveDetail" class="btn_small">-->
	                            <a id="cancelDetail" class="btn_cancel_s" >返回</a>
		                    </form>
	                            
	                      <!--    <div class="clear oneword" style="display: block;"><img width="17" height="15" src="style/images/quote_l.png">&nbsp; <span>公司名称公司名称公司名称</span> &nbsp;<img width="17" height="15" src="style/images/quote_r.png"></div>
	                      -->
	                        <h3 class="dn">已选择标签</h3>
	                        <ul style="overflow:auto" id="hasLabels" class="reset clearfix">
	                        			                        	<li><span>{{company.companytag}}</span></li>
		                        		                        	 
		                        		                        	 
		                        	                            <li class="link">编辑</li>
	                        </ul>
	                        <div class="dn" id="addLabels">
	                        	 
	                        	<input type="hidden" value="1" id="labelPageNo">
	                            <input type="button"   disabled="disabled" value="贴上" class="fr" id="add_label">
                            	<input type="text" placeholder="添加自定义标签" name="label" id="label"  v-model="company.companytag" class="label_form fr">	
	                            <div class="clear"></div>
	                            <ul class="reset clearfix"> </ul>
	                           <!--   <a id="saveLabels" class="btn_small" href="javascript:void(0)">保存</a>-->
	                            <a id="cancelLabels" class="btn_cancel_s" href="javascript:void(0)">返回</a>
	                        </div>
	                    </div>
	                    <a title="编辑基本信息" class="c_edit" id="editCompanyDetail" href="javascript:void(0);" style="display: block;"></a>
	                	<div class="clear"></div>
	                </div>
                
                	<div class="c_breakline"></div>
       
       				<div id="Product">
        					        				
	        					<div class="product_wrap">

						    		<!--无产品 -->
									<dl class="c_section dn">
					                	<dt>
					                    	<h2><em></em>公司产品</h2>
					                    </dt>
					                    <dd>
					                    	<div class="addnew">
					                        	酒香不怕巷子深已经过时啦！<br>
												把自己优秀的产品展示出来吸引人才围观吧！<br>
					                            <a class="product_edit" href="javascript:void(0)">+添加公司产品</a>
					                        </div>
					                    </dd>
					                </dl>
	                
					            	<!--产品编辑-->
					                <dl id="newProduct" class="newProduct dn">
					                	<dt>
					                    	<h2><em></em>公司产品</h2>
					                    </dt>
					                    <dd>
					                        <form method="post" class="productForm">
					                            <div class="new_product">
					                            	
							                            <div class="product_upload dn productNo">
							                                <div style="background-color: rgb(147, 183, 187);">
							                                	<span>上传产品图片</span> 
							                                    <br>	
							                                   		 尺寸：380*220px  	大小：小于5M
							                                </div>
							                            </div>
							                            <div class="product_upload productShow">
							                            	<img width="380" height="220" :src="company.productimage">
								                        	<span>更换产品图片<br>380*220px 小于5M</span>
								                        </div>
							                        
							                        <input type="file" title="支持jpg、jpeg、gif、png格式，文件小于5M"   name="myfiles" id="myfiles0">
							                    	<input type="hidden" value="3" name="type" class="type"> 
							                    	<input type="hidden" value="images/product_default.png" name="productPicUrl" class="productInfos">   
							                    </div>
					                            
					                            <div class="cp_intro">
					                               	<input type="text" placeholder="请输入产品名称"  v-model="company.productname" name="product" class="valid">	
					                                <input type="text" placeholder="请输入产品网址"  v-model="company.producturl"  name="productUrl" class="valid">	
					                                <textarea placeholder="请简短描述该产品定位、产品特色、用户群体等" maxlength="500" v-model="company.productintroduction "  class="s_textarea valid" name="productProfile"> </textarea>	
					                                <div class="word_count fr">你还可以输入 <span>437</span> 字</div>
					                                <div class="clear"></div>
					                                <!--  <input type="submit" value="保存" class="btn_small">
					                                  <a class="btn_cancel_s" href="javascript:void(0)" id="cancelLabels">返回</a>-->
					                        		<input type="hidden" value="11867" class="product_id">
					                            </div>
											</form>
					                    </dd>
					                </dl>
					                <!--有产品-->
					                <dl class="c_product">
					                	<dt>
					                    	<h2><em></em>公司产品</h2>
					                    </dt>
					                    <dd>
					                    	<img width="380" height="220"   :src="company.productimage">
				                        	<div class="cp_intro">
				                        		<h3><a   :href="company.producturl" target="_blank">{{company.productname}} </a></h3>
				                        		<h4><a   :href="company.producturl" target="_blank">{{company.producturl}} </a></h4>
					                            <div class="scroll-pane" style="overflow: hidden; padding: 0px; width: 260px;">
					                            	
					                            <div class="jspContainer" style="width: 260px; height: 140px;">
					                            <div class="jspPane" style="padding: 0px; top: 0px; width: 260px;">
					                            <div> {{company.productintroduction	}}</div>
					                            </div>
					                            </div>
					                            
					                            </div>
					                        </div>
					                        <a title="编辑公司产品" class="c_edit product_edit" href="javascript:void(0)"></a>
					            			<!--  <a title="新增公司产品" class="c_add product_add" href="javascript:void(0)"></a>-->
					            								                    </dd>
					                </dl>
	            
	              				</div>
       								        						    			        			</div>   <!-- end #Product --> 
       	
       				<div id="Profile">
			            				        	<div class="profile_wrap">
					             <!--无介绍 -->
									<dl class="c_section dn" style="display: none;">
					                	<dt>
					                    	<h2><em></em>公司介绍</h2>
					                    </dt>
					                    <dd>
					                    	<div class="addnew">
					                        	详细公司的发展历程、让求职者更加了解你!<br>
					                            <a id="addIntro" href="javascript:void(0)">+添加公司介绍</a>
					                        </div>
					                    </dd>
					                </dl>
					            <!--编辑介绍-->
					                <dl class="c_section newIntro dn" style="display: none;">
					                    <dt>
					                        <h2><em></em>公司介绍</h2>
					                    </dt>
					                    <dd>
						                    <form id="companyDesForm">
						                        <textarea placeholder="请分段详细描述公司简介、企业文化等"   v-model="company.companyprofile" name="companyProfile" class="valid"></textarea>		                                        
						                        <div class="word_count fr">你还可以输入 <span>955</span> 字</div>
						                        <div class="clear"></div>
						                       <!--   <input type="submit" value="保存" id="submitProfile" class="btn_small">-->
						                        <a id="delProfile" class="btn_cancel_s" href="javascript:void(0)">返回</a>
						                    </form>
					                    </dd>
					                </dl>
					            
					            <!--有介绍-->
					               <dl class="c_section" style="display: block;">
					               		<dt>
					                   		<h2><em></em>公司介绍</h2>
					                   	</dt>
					                   	<dd>
					                   		<div class="c_intro"> {{company.companyprofile}}</div>
					                   		<a title="编辑公司介绍" id="editIntro" class="c_edit" href="javascript:void(0)"></a>
					                   	</dd>
					               	</dl>
				            </div>
				                 	
	     			</div><!-- end #Profile -->
      	
      	<!--[if IE 7]> <br /> <![endif]-->
	    
	        	 		        	<!--无招聘职位
						<dl id="noJobs" class="c_section">
		                	<dt>
		                    	<h2><em></em>招聘职位</h2>
		                    </dt>
		                    <dd>
		                    	<div class="addnew">
		                        	发布需要的人才信息，让伯乐和千里马尽快相遇……<br>
		                            <a href="create.jsp">+添加招聘职位</a>
		                        </div>
		                    </dd>
		                </dl>-->
	          	
	          	<input type="hidden" value="" name="hasNextPage" id="hasNextPage">
	          	<input type="hidden" value="" name="pageNo" id="pageNo">
	          	<input type="hidden" value="" name="pageSize" id="pageSize">
          		<div id="flag"></div>
            </div>	<!-- end .content_l -->
            
            <div class="content_r">
            	<div id="Tags">
	            	<div id="c_tags_show" class="c_tags solveWrap" style="display: block;">
	                    <table>
	                    	<tbody>
	                    		<tr><td>地点</td><td>{{company.city}}</td></tr
	                    		><tr><td>领域</td><td>{{company.industry}}</td></tr>
	                    		<tr><td>规模</td><td>{{company.companysize	}}</td></tr>
	                    		<tr><td>主页</td><td><a target="_blank" :href="company.companywebsite">{{company.companywebsite}}</a></td></tr>
	                    	</tbody>
	                    </table>
	                    <a id="editTags" class="c_edit" href="javascript:void(0)"></a>
	                </div>
	                <div id="c_tags_edit" class="c_tags editTags dn" style="display: none;">
		                <form id="tagForms">
		                    <table>
		                        <tbody><tr>
		                            <td>地点</td>
		                            <td>
		                            	<input type="text" placeholder="请输入地点"  v-model="company.city" name="city" id="city" class="valid">	
		                            </td>
		                        </tr>
		                        <tr>
		                            <td>领域</td><!-- 支持多选 -->
		                            <td>
		                            	 
		                            	<input type="text" placeholder="请输入行业领域"  v-model="company.industry"   class="valid">	 
		                                
		                            </td>
		                        </tr>
		                        <tr>
		                            <td>规模</td>
		                            <td>
		                            	 
		                            	<input type="button"  v-model="company.companysize "   id="select_sca" class="select_tags">
		                                <div class="selectBox dn" id="box_sca" style="display: none;" >
		                                    <ul class="reset" >
		                                    	 <li>少于15人</li>
				                                 <li>15-50人</li>
				                            	 <li>50-150人</li>
				                            	 <li >150-500人</li>
				                            	 <li>500-2000人</li>
				                            	 <li>2000人以上</li>
				                             </ul>
		                                </div>	
		                            </td>
		                        </tr>
		                        <tr>
		                            <td>主页</td>
		                            <td>
                            			<input type="text" placeholder="请输入网址"   v-model="company.companywebsite " name="companyUrl" id="companyUrl" class="valid">	
		                            </td>
		                        </tr>
		                    </tbody></table>
		                    <input type="hidden" id="comCity" value="上海">
		                    <input type="hidden" id="comInd" value="移动互联网">
		                    <input type="hidden" id="comSize" value="150-500人">
		                    <input type="hidden" id="comUrl" value="http://www.zmtpost.com">
		                   <!--  <input type="submit" value="保存" id="submitFeatures" class="btn_small">--> 
		                    <a id="cancelFeatures" class="btn_cancel_s" href="javascript:void(0)">取消</a>
		                    <div class="clear"></div>
		            	</form>
	                </div>
       			</div><!-- end #Tags -->
       			
       			<dl class="c_section c_stages">
                	<dt>
                    	<h2><em></em>融资阶段</h2>
                    	<a title="编辑融资阶段" class="c_edit" href="javascript:void(0)"></a>
                    </dt>
                    <dd>
                    	<ul class="reset stageshow">
                    		<li>目前阶段：<span class="c5">{{company.development}}</span></li>
                    		                    	</ul>
                    	<form class="dn" id="stageform">
                    		<div class="stageSelect">
                    			<label>目前阶段</label>
                    			<input type="hidden" :value="company.development" id="financeStage" name="financeStage">
	                         	 
                                 
										<select      v-model="company.development"  >
  												 <option    value="天使轮">天使轮</option>
  												 <option    value="A轮">A轮</option>
  												 <option    value="B轮">B轮</option>
  												 <option    value="C轮">C轮</option>
  												 <option    value="D轮">D轮</option>
										</select>				                           					                           		
	                                  
	                             
                    		</div>	
	                    
		                   <!--  <input type="submit" value="保存" class="btn_small">--> 
		                    <a id="cancelStages" class="btn_cancel_s" href="javascript:void(0)">取消</a>
		                    <div class="clear"></div>
		                    
		                    <div class="dn" id="cloneInvest">
		                    	<label>融资阶段</label>
	                    		<input type="hidden" class="select_invest_hidden" name="select_invest_hidden">
			                    <input type="button" value="发展阶段" class="select_tags_short select_invest">
			                    <div class="selectBoxShort dn" style="display: none;">
			                        <ul class="reset">
			                        					                        					                        				                        						                        	<li>天使轮</li>
				                        					                        				                        						                        	<li>A轮</li>
				                        					                        				                        						                        	<li>B轮</li>
				                        					                        				                        						                        	<li>C轮</li>
				                        					                        				                        						                        	<li>D轮及以上</li>
				                        					                        				                        						                        	<li>上市公司</li>
				                        					                        			                        </ul>
			                    </div>
			                    <label>投资机构</label>
			                    <input type="text" placeholder="如真格基金" name="stageorg">
		                    </div>
		                </form>
                    </dd>
                </dl><!-- end .c_stages -->
       				
	      
	       		<div id="Member">		
		       			       		<!--有创始团队-->
		                <dl class="c_section c_member">
		                	<dt>
		                    	<h2><em></em>创始团队</h2>
		                    	 <!-- <a title="添加创始人" class="c_add" href="javascript:void(0)"></a> -->
	                    				                    </dt>
		                    <dd> 
		                    			                    				                    
			       					<div class="member_wrap">
			       						
				                        <!-- 无创始人 -->
				                        <div class="member_info addnew_right dn">
				                        	展示公司的领导班子，<br>提升诱人指数！<br>
				                            <a class="member_edit" href="javascript:void(0)">+添加成员</a>
				                        </div>
				                        
				                        <!-- 编辑创始人 -->
		                        		<div class="member_info newMember dn">
			                        		<form class="memberForm">
					                            <div class="new_portrait">
						                            <div class="portrait_upload dn portraitNo">
						                                <span>上传创始人头像</span>
						                            </div>
						                            <div class="portraitShow">
						                            	<img width="120" height="120"  :src="company.ceoimage ">
							                        	<span>更换头像</span>
							                        </div>
							                        <input type="file" value="" title="支持jpg、jpeg、gif、png格式，文件小于5M" onchange="member_check(this,'http://www.lagou.com/c/upload.json','portraitNo','portraitShow','type','leaderInfos');" name="myfiles" id="profiles0">
							                    	<input type="hidden" value="7" name="type" class="type">
							                    	<input type="hidden" value="images/leader_default.png" name="photo" class="leaderInfos">
						                            <em>
												                                尺寸：120*120px <br> 	
												                                大小：小于5M
						                            </em>
						                        </div>
						                        <input type="text" placeholder="请输入创始人姓名"  v-model="company.ceoname" name="name" class="valid">	
					                             
					                            <textarea placeholder="请输入创始人个人简介" v-model="company.ceointroduced"  maxlength="500" class="s_textarea valid" name="remark"> </textarea>	
					                            <div class="word_count fr">你还可以输入 <span>476</span> 字</div>
					                            <div class="clear"></div>
					                             <!-- <input type="submit" value="保存" class="btn_small"> 
				                                <a class="btn_cancel_s member_delete" href="javascript:void(0)">删除</a>-->
				                        		<input type="hidden" value="11493" class="leader_id">
				                        	</form>
				                        </div>
				                        
				                        <!-- 显示创始人 -->
				                    	<div class="member_info">
	                    					<a title="编辑创始人" class="c_edit member_edit" href="javascript:void(0)"></a>
				                        	<div class="m_portrait">
				                            	<div></div>
				                            	<img width="120" height="120"   :src="company.ceoimage ">
					                        </div>
				                            <div class="m_name">{{company.ceoname}}<a target="_blank" class="weibo" href="http://www.zmtpost.com"></a></div>
				                            <div class="m_position">ceo</div>
				                    		<div class="m_intro">{{company.ceointroduced	}} </div>
				                        </div>
				                        
				                     </div><!-- end .member_wrap -->
				                     				                 		                    </dd>
		                </dl>
		       			       	</div> <!-- end #Member -->
	       	
	       	
	       
	       	
        </div>
   	</div>

<!-------------------------------------弹窗lightbox  ----------------------------------------->
<div style="display:none;">
	<div style="width:650px;height:470px;" class="popup" id="logoUploader">
		<object width="650" height="470" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" id="FlashID">
		  <param value="../../flash/avatar.swf?url=http://www.lagou.com/cd/saveProfileLogo.json" name="movie">
		  <param value="high" name="quality">
		  <param value="opaque" name="wmode">
		  <param value="111.0.0.0" name="swfversion">
		  <!-- 此 param 标签提示使用 Flash Player 6.0 r65 和更高版本的用户下载最新版本的 Flash Player。如果您不想让用户看到该提示，请将其删除。 -->
		  <param value="../../Scripts/expressInstall.swf" name="expressinstall">
		  <!-- 下一个对象标签用于非 IE 浏览器。所以使用 IECC 将其从 IE 隐藏。 -->
		  <!--[if !IE]>-->
		  <object width="650" height="470" data="../../flash/avatar.swf?url=http://www.lagou.com/cd/saveProfileLogo.json" type="application/x-shockwave-flash">
		    <!--<![endif]-->
		    <param value="high" name="quality">
		    <param value="opaque" name="wmode">
		    <param value="111.0.0.0" name="swfversion">
		    <param value="../../Scripts/expressInstall.swf" name="expressinstall">
		    <!-- 浏览器将以下替代内容显示给使用 Flash Player 6.0 和更低版本的用户。 -->
		    <div>
		      <h4>此页面上的内容需要较新版本的 Adobe Flash Player。</h4>
		      <p><a href="http://www.adobe.com/go/getflashplayer"><img width="112" height="33" src="style/images/get_flash_player.gif" alt="获取 Adobe Flash Player"></a></p>
		    </div>
		    <!--[if !IE]>-->
		  </object>
		  <!--<![endif]-->
		</object>
	</div><!-- #logoUploader -->
</div>
<!------------------------------------- end ----------------------------------------->
			<div class="clear"></div>
			<input type="hidden" value="af5b64a9520a4b7da6287ff3400dde11" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop" style="display: none;"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="about.jsp">联系我们</a>
		    <a target="_blank" href="http://www.lagou.com/af/zhaopin.jsp">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">求职招聘微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">求职招聘微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>
<script type="text/javascript">

    var mycompanyvue=new Vue({
        el:'#body',
        data:{
    	 ident:-1,
         email:"",
         status:'',
         isChangeImag:0,
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
         jobList:[] 
        
         
        },
        watch:{
        	company: {
	                 //this.pageHandler(1);
	                handler(val, oldVal){
			              this.$http.post("saveCompany.do",
		                	JSON.stringify(this.company),
		                	{emulateJSON : true}
		                   ).then(
		        			function(res){
		            			  
		        			},
		        			function(res){
		        			   
		        				 
		        			}
		        		);
			         },
		        	  deep:true
		        		
		           },         
	                  
	            
        
        },
        methods:{
            
           saveResumeinformation:function(){
           	 
           	 if($("#expectCity").get(0).value!=''){this.resumeinformation.city=$("#expectCity").get(0).value ;}
           	 if($("#schoolYearbegin").get(0).value!=''){this.resumeinformation.beginyear=$("#schoolYearbegin").get(0).value ;}
 			 if($("#schoolYearend").get(0).value!=''){this.resumeinformation.endyear=$("#schoolYearend").get(0).value ;}

             console.log(this.resumeinformation.city+this.resumeinformation.worktype+
             this.resumeinformation.expectedposition+this.resumeinformation.expectedsalary)
            
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
            			this.$http.post("getJoblistByConmpanyId.do",   //getJoblistByConmpanyId
				                	{'companyid': this.company.companyid},{emulateJSON:true}).then(
				        			function(res){
				            			this.jobList=res.data;
				            			 
							        	   
				        			},
				        			function(res){
				        				console.log(res);
				                    }
				        );//end getJoblistByConmpanyId
			        	   
        			},
        			function(res){
        				console.log(res);
                    }
        	);
        	
        	
        	
        }  //end created
    });

</script>
 





	
<script src="style/js/company.min.js" type="text/javascript"></script>
<script>
var avatar = {};
avatar.uploadComplate = function( data ){
	var result = eval('('+ data +')');
	if(result.success){
		jQuery('#logoShow img').attr("src",ctx+ '/'+result.content);
		jQuery.colorbox.close();
	}
};
</script>
<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>
<script src="style/js/jquery.lib.min.js" type="text/javascript"></script>
<script src="style/js/conv.js" type="text/javascript"></script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script></head>
<!--  -->


<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div></body></html>