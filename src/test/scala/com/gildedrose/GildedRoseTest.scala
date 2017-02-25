package com.gildedrose

import org.scalatest._

class GildedRoseTest  extends FlatSpec with Matchers {
      it should "Sellin decrease by one but quality does not turn negative." in {
        var items = Array[Item](new Item("foo", 0, 0))
        val app = new GildedRose(items)
        app.updateQuality()
        app.items.length should be(1)
        (app.items(0)) should equal (Item("foo", -1, 0))
      }

      it should "Sellin decrease by one and quality descrease by one" in {
        var items = Array[Item](new Item("foo", 0, 1))
        val app = new GildedRose(items)
        app.updateQuality()
        app.items.length should be(1)
        (app.items(0)) should equal (Item("foo", -1, 0))
      }
}