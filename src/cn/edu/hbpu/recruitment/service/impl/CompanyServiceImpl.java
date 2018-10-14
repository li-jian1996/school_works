package cn.edu.hbpu.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.recruitment.mapper.CompanyMapper;
import cn.edu.hbpu.recruitment.pojo.Company;
import cn.edu.hbpu.recruitment.pojo.CompanyExample;
import cn.edu.hbpu.recruitment.pojo.CompanyExample.Criteria;
 
import cn.edu.hbpu.recruiyment.service.CompanyService;
 

@Service
public class CompanyServiceImpl implements CompanyService {
    
	@Autowired
	private CompanyMapper companyMapper;
	public int register(String email, String pwd) {
		Company company =new Company();
		company.setEmail(email);
		company.setPwd(pwd);
		return companyMapper.insertSelective(company);
	}
	
	public Company getCompanyByEmail(String email) {
		CompanyExample companyExample=new CompanyExample();
		companyExample.createCriteria().andEmailEqualTo(email);
		List<Company> list= companyMapper.selectByExample(companyExample);
		//下面几行是可能会报错的代码   2018年9月12日 09:21:40   jelly
		list.get(0).setCompanylogo("/pic/"+list.get(0).getCompanylogo());
		list.get(0).setCompanyidimage("/pic/"+list.get(0).getCompanyidimage());
		list.get(0).setCeoimage("/pic/"+list.get(0).getCeoimage());
		list.get(0).setProductimage("/pic/"+list.get(0).getProductimage());
		
		return list.size()>0?list.get(0):null;
	}

	public Company checkCompany(String email, String pwd) {
		CompanyExample companyExample=new CompanyExample();
		companyExample.createCriteria().andEmailEqualTo(email).andPwdEqualTo(pwd);
		List<Company> list= companyMapper.selectByExample(companyExample);
		return list.size()>0?list.get(0):null;
	}

	public List<Company> getIndexCompanyList() {
		CompanyExample companyExample=new CompanyExample();
	    Criteria criteria = companyExample.createCriteria();
	    companyExample.setOrderByClause("companyId desc");
	    List<Company> list =companyMapper.selectByExample(companyExample);
	    list=list.subList(0, 6);
	    System.out.println("getIndexCompanyList"+list.size());
	    list=changeCompanyList(list);
	   
		return list;
	}
	//工具  处理下 company类
	private  List<Company>   changeCompanyList(List<Company> list) {
		for (int i = 0; i < list.size(); i++) {
			Company company = list.get(i);
			String image = company.getCompanyidimage();
			String[] split = image.split(",");
			company.setCompanyidimage("/pic/" + split[0]);
			company.setCompanylogo("/pic/"+company.getCompanylogo());
			company.setCeoimage("/pic/"+company.getCeoimage());
			String Compprofile =  company.getCompanyprofile();
			if (Compprofile.length() > 12) {
				company.setCompanyprofile(Compprofile.substring(0, 8) + "...");
			}
		}
		return list;
	}

	public PageInfo<Company> listCompanyByPage(int page,int row,String city,String fz,String hy,String search) {
		PageHelper.startPage(page, row);
		System.out.println("companyService##"+city+hy+fz+search);
		if (city.equals("全国")||city.equals("其他")) {
			city="";
		}
		CompanyExample example =new CompanyExample();
		Criteria criteria=example.createCriteria();
	    if (city!=null||!city.equals("")) {
	    	criteria.andCityLike("%"+city+"%");
	    }
	    if (hy!=null||!hy.equals("")) {
	    	criteria.andIndustryLike("%"+hy+"%");
	    }
	    if (fz!=null||!fz.equals("")) {
	    	criteria.andDevelopmentLike("%"+fz+"%");
	    }
	    if (search!=null||!search.equals("")) {
	    	criteria.andCompanynameLike("%"+search+"%");
	    }
		List<Company> list= companyMapper.selectByExample(example); 
		list=changeCompanyList(list);
		PageInfo<Company> pageInfo = new PageInfo<Company>(list);
		return pageInfo;
	}

	public void updateCompany(Company company) {
		// TODO Auto-generated method stub
		companyMapper.updateByPrimaryKeySelective(company);
	}
	
	
}
