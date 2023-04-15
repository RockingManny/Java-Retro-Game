package com.skillrisers.streetfighter.sprites;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Player extends CommonPlayer {
	
	private BufferedImage idleImages[] = new BufferedImage[6];
	private BufferedImage walkImages[] = new BufferedImage[6];
	private BufferedImage jumpImages[] = new BufferedImage[6];
	private BufferedImage crouchImages[] = new BufferedImage[2];
	private BufferedImage LAttackImages[] = new BufferedImage[2];
	private BufferedImage hitImages[] = new BufferedImage[2];
	
	public Player() throws Exception {
		x = 150;
		y = GROUND;
		w = 200;
		h = 300;
		force=0;
		speed = 0;
		flip=false;
		playerImg = ImageIO.read(Player.class.getResource(PLAYER_IMAGE));
		loadIdleImages();
		loadWalkImages();
		loadJumpImages();
		loadCrouchImages();
		loadLAttackImages();
		loadHitImages();
	}
	
	private void loadHitImages(){
		crouchImages[0] = playerImg.getSubimage(10,295,68,84);
		crouchImages[0] = playerImg.getSubimage(10,295,68,84);
		crouchImages[1] = playerImg.getSubimage(157,295,68,84);
	}

	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(9,36,52,86);
		idleImages[1] = playerImg.getSubimage(62,36,52,86);
		idleImages[2] = playerImg.getSubimage(114,36,52,86);
		idleImages[3] = playerImg.getSubimage(167,36,52,86);
		idleImages[4] = playerImg.getSubimage(221,36,52,86);
		idleImages[5] = playerImg.getSubimage(276,36,52,86);
	}

	private void loadWalkImages() {
		walkImages[0] = playerImg.getSubimage(9,36,52,86);
		walkImages[1] = playerImg.getSubimage(62,36,52,86);
		walkImages[2] = playerImg.getSubimage(114,36,52,86);
		walkImages[3] = playerImg.getSubimage(167,36,52,86);
		walkImages[4] = playerImg.getSubimage(221,36,52,86);
		walkImages[5] = playerImg.getSubimage(276,36,52,86);
	}

	private void loadJumpImages() {
		jumpImages[0] = playerImg.getSubimage(9,36,52,86);
		jumpImages[1] = playerImg.getSubimage(62,36,52,86);
		jumpImages[2] = playerImg.getSubimage(114,36,52,86);
		jumpImages[3] = playerImg.getSubimage(167,36,52,86);
		jumpImages[4] = playerImg.getSubimage(221,36,52,86);
		jumpImages[5] = playerImg.getSubimage(276,36,52,86);
	}

	private void loadCrouchImages() {
		crouchImages[0] = playerImg.getSubimage(10,295,68,84);
		crouchImages[1] = playerImg.getSubimage(157,295,68,84);
	}
	private void loadLAttackImages() {
		crouchImages[0] = playerImg.getSubimage(10,295,68,84);
		crouchImages[1] = playerImg.getSubimage(157,295,68,84);
	}
	
	public BufferedImage printIdle() {
		isAttacking = false;
		if(imageIndex >= 6) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}

	public BufferedImage printWalk() {
		if(imageIndex >= 6) {
			imageIndex = 0;
			currentMove = WALK;
			isAttacking=false;
		}
		isAttacking=true;
		BufferedImage img = walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printJump() {
		if(imageIndex >= 6) {
			imageIndex = 0;
			currentMove = JUMP;
		}
		BufferedImage img = jumpImages[imageIndex];
		imageIndex++;
		return img;
	}

	public BufferedImage printCrouch() {
		if(imageIndex >= 2) {
			imageIndex = 0;
			currentMove = CROUCH;
		}
		BufferedImage img = crouchImages[imageIndex];
		imageIndex++;
		return img;
	}

	public BufferedImage printLAttack() {
		if(imageIndex >= 2) {
			imageIndex = 0;
			currentMove = CROUCH;
		}
		BufferedImage img = LAttackImages[imageIndex];
		imageIndex++;
		return img;
	}

	public BufferedImage printHit() {
		if(imageIndex >= 2) {
			imageIndex = 0;
			currentMove = CROUCH;
		}
		BufferedImage img = hitImages[imageIndex];
		imageIndex++;
		return img;
	}

}
	