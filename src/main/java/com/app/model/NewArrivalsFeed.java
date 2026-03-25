package com.app.model;

import java.util.List;

public class NewArrivalsFeed {

  public static List<NewArrival> list() {
    return List.of(
        new NewArrival("2025-12-28", "ワイヤレスイヤホン Pro X"),
        new NewArrival("2025-12-20", "軽量ノートPC 14インチ"),
        new NewArrival("2025-12-10", "USB-C 充電器 65W"),
        new NewArrival("2026-03-25", "iPad Air m4モデル 512GB")
    );
  }

  private NewArrivalsFeed() {}
}
