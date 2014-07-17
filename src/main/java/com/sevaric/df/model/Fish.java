package com.sevaric.df.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Fish extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer FinTop;
    ModelRenderer Fin1;
    ModelRenderer Fin2;
    ModelRenderer TailFront;
    ModelRenderer TailEnd;
  
  public Fish()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -4F, -8F, 10, 10, 10);
      Head.setRotationPoint(-1F, 18F, 3F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      FinTop = new ModelRenderer(this, 30, 20);
      FinTop.addBox(0F, 0F, 0F, 2, 1, 6);
      FinTop.setRotationPoint(-1F, 13F, -3F);
      FinTop.setTextureSize(64, 32);
      FinTop.mirror = true;
      setRotation(FinTop, 0F, 0F, 0F);
      Fin1 = new ModelRenderer(this, 16, 20);
      Fin1.addBox(0F, 0F, 0F, 1, 5, 6);
      Fin1.setRotationPoint(5F, 16F, -3F);
      Fin1.setTextureSize(64, 32);
      Fin1.mirror = true;
      setRotation(Fin1, 0F, 0F, 0F);
      Fin2 = new ModelRenderer(this, 0, 20);
      Fin2.addBox(0F, 0F, 0F, 1, 5, 6);
      Fin2.setRotationPoint(-6F, 16F, -3F);
      Fin2.setTextureSize(64, 32);
      Fin2.mirror = true;
      setRotation(Fin2, 0F, 0F, 0F);
      TailFront = new ModelRenderer(this, 48, 0);
      TailFront.addBox(-1F, -3F, 0F, 2, 5, 1);
      TailFront.setRotationPoint(0F, 19F, 5F);
      TailFront.setTextureSize(64, 32);
      TailFront.mirror = true;
      setRotation(TailFront, 0F, 0F, 0F);
      TailEnd = new ModelRenderer(this, 40, 0);
      TailEnd.addBox(-1F, -4F, 0F, 2, 7, 2);
      TailEnd.setRotationPoint(0F, 19F, 6F);
      TailEnd.setTextureSize(64, 32);
      TailEnd.mirror = true;
      setRotation(TailEnd, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    FinTop.render(f5);
    Fin1.render(f5);
    Fin2.render(f5);
    TailFront.render(f5);
    TailEnd.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
