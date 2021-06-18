package jp.te4a.spring.boot.MyBootApp5;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


//SpringBootの起動クラスを指定
@ContextConfiguration(classes = App.class)
//クラス内の全メソッドにおいて、実行前にDIコンテナの中身を破棄する設定
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//テストランナー：各テストケース（テストメソッド）を制御する：DIする場合は必須かも
@ExtendWith(SpringExtension.class)
//MockおよびWACの自動ロードサーブレット環境を自動作成する
@AutoConfigureMockMvc
// テスト時に起動するSpringBootプロジェクトの使用ポート番号を設定する。
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//クラス単位でインスタンスを作成
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HelloControllerSpringTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    WebApplicationContext wac;
    
    @BeforeAll
    public void テスト前処理(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void indexにアクセス() throws Exception{
        mockMvc.perform(get("/"))
        .andExpect(status().is2xxSuccessful())
        .andExpect(view().name("index"))
        .andReturn();
    }

    // @Test
    // public void postする() throws Exception{
    //     mockMvc.perform(
    //         post("/post").
    //         param("text1","hogehoge")
    //         )
    //         .andExpect(status().isOk())
    //         .andExpect(model().attributeExists("msg"))
    //         .andExpect(
    //             model().attribute(
    //                 "msg", 
    //                 String.format("you write %s!!!","hogehoge") 
    //                 ))
    //         .andExpect(view().name("index"))
    //         .andExpect(content().string(containsString(
    //             String.format("you write %s!!!","hogehoge") 
    //             )))
    //         .andReturn();
    // }
}