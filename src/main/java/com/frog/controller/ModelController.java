package com.frog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frog.common.Result;
import com.frog.entity.Model;
import com.frog.service.IModelService;
import com.frog.util.PrimaryKey;
import com.frog.verifybean.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bufflu
 * @since 2019-09-23
 */
@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private IModelService modelService;

    @PostMapping("/add")
    public Result add(@RequestBody Model model) {
        Validator.verify(model);
        model.setId(PrimaryKey.create());
        model.setDate(LocalDateTime.now());
        modelService.save(model);
        return Result.ok();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Model model) {
        Validator.verify(model);
        model.setId(PrimaryKey.create());
        model.setDate(LocalDateTime.now());
        modelService.updateById(model);
        return Result.ok();
    }

    @GetMapping("/remove/{id}")
    public Result remove(@PathVariable("id") String id) {
        modelService.removeById(id);
        return Result.ok();
    }

    @PostMapping("/page/{current}/{size}")
    public Result page(String name, @PathVariable("current") int current, @PathVariable("size") int size) {
        Page<Model> modelPage = new Page<>(current, size);
        QueryWrapper<Model> wrapper = StringUtils.isNotEmpty(name) ? new QueryWrapper<Model>().like("name", name) : Wrappers.emptyWrapper();
        modelService.page(modelPage, wrapper);
        Result result = Result.ok(modelPage.getRecords());
        result.setTotal(modelPage.getTotal());
        return result;
    }

}
