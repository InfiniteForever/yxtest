package group.yunxin.service;
import java.util.List;

import group.yunxin.pojo.TbCategory;
import group.yunxin.vo.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CategoryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCategory> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCategory category);
	
	
	/**
	 * 修改
	 */
	public void update(TbCategory category);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCategory findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCategory category, int pageNum,int pageSize);
	
}
