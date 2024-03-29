package group.yunxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbTkQues;
import group.yunxin.service.TkQuesService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;

/**
 * controller
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/tkQues")
public class TkQuesController
{

	@Autowired
	private TkQuesService tkQuesService;

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbTkQues> findAll()
	{
		return tkQuesService.findAll();
	}

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows)
	{
		return tkQuesService.findPage(page, rows);
	}

	/**
	 * 增加
	 * 
	 * @param tkQues
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbTkQues tkQues)
	{
		try
		{
			tkQuesService.add(tkQues);
			return new Result(true, "增加成功");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 修改
	 * 
	 * @param tkQues
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTkQues tkQues)
	{
		try
		{
			tkQuesService.update(tkQues);
			return new Result(true, "修改成功");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	/**
	 * 获取实体
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbTkQues findOne(Long id)
	{
		return tkQuesService.findOne(id);
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long[] ids)
	{
		try
		{
			tkQuesService.delete(ids);
			return new Result(true, "删除成功");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	/**
	 * 查询+分页
	 * 
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbTkQues tkQues, int page, int rows)
	{
		return tkQuesService.findPage(tkQues, page, rows);
	}

}
