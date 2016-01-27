package com.nearsoft.workshop.strategy.scala.character

abstract class Character {
  var weaponBehaviour: Option[() => String] = None

  def fight

  def setWeaponBehaviour(weaponBehaviour: () => String) {
    this.weaponBehaviour = Some(weaponBehaviour)
  }

  def useWeapon = weaponBehaviour match {
    case Some(weapon) => weapon.apply()
    case None => "doing nothing, no weapon"
  }
}
